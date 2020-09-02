package com.sakura.project.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.page.PageMethod;
import com.sakura.project.common.dto.MgUserInfoDto;
import com.sakura.project.common.exception.ErrorException;
import com.sakura.project.common.util.Assert;
import com.sakura.project.common.util.CommonsUtil;
import com.sakura.project.common.util.DateUtils;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.MD5Util;
import com.sakura.project.common.util.ObjectTools;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgRole;
import com.sakura.project.entity.MgUserInfo;
import com.sakura.project.entity.example.MgUserInfoExample;
import com.sakura.project.mapper.generator.MgRoleGeneratorMapper;
import com.sakura.project.mapper.generator.MgUserInfoGeneratorMapper;
import com.sakura.project.service.MgUserService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/28 16:53
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class MgUserServiceImpl implements MgUserService {

    @Autowired
    private MgUserInfoGeneratorMapper mgUserInfoGeneratorMapper;
    @Autowired
    private MgRoleGeneratorMapper mgRoleGeneratorMapper;

    @Override
    public JsonResult<MgUserInfoDto> get(Integer userId) {
        PageData pageData = new PageData();
        pageData.put("id", userId);
        return JsonResult.<MgUserInfoDto>success(mgUserInfoGeneratorMapper.list(pageData).get(0));
    }

    @Override
    public PageResult<MgUserInfoDto> list(Pageable pageable, PageData pageData) {
        //开启分页插件
        PageMethod.startPage(pageable.getPageNumber(), pageable.getPageSize());

        //查询
        List<MgUserInfoDto> list = mgUserInfoGeneratorMapper.list(pageData);

        return PageResult.success(list);
    }

    @Override
    public JsonResult<Boolean> add(MgUserInfo mgUserInfo) {
        try {
            //设置用户的密码,数据库中不能明文传入密码
            String salt = CommonsUtil.getRandomString(6);
            mgUserInfo.setUserPasswordSalt(salt);
            mgUserInfo.setUserPassword(MD5Util.getMd5(mgUserInfo.getUserPassword(), salt));

            //从用户输入的身份证号中获取出生日期和性别
            PageData pageData = CommonsUtil.getIdentityInfoByIdCard(mgUserInfo.getUserIdCard());
            Assert.isTrue(ObjectTools.isNotBlank(pageData), "身份证输入有误,请输入身份证!");
            mgUserInfo.setUserBirthday(DateUtils.parseDate(pageData.getStringVal("birthday")));
            mgUserInfo.setUserGender("M".equals(pageData.getString("sex")) ? 1 : 2);

            mgUserInfoGeneratorMapper.insertSelective(mgUserInfo);

            //用ignore插入时,如果数据违反了唯一索引约束,会忽略此次插入的数据,所以只需要id是不是等于0即可
            if (ObjectTools.isBlank(mgUserInfo.getId()) || mgUserInfo.getId() <= 0) {
                throw new ErrorException("用户已存在,请勿重复添加!");
            }
            return JsonResult.<Boolean>success();
        } catch (ErrorException e) {
            e.printStackTrace();
            return JsonResult.error(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResult.error("添加用户失败");
        }
    }

    @Override
    public JsonResult<Boolean> update(MgUserInfo mgUserInfo) {
        mgUserInfoGeneratorMapper.updateByPrimaryKeySelective(mgUserInfo);
        return JsonResult.<Boolean>success(true);
    }

    @Override
    public JsonResult<Boolean> updatePwd(PageData pageData) {
        //用户输入的新密码
        String newPassword = pageData.getString("newPassword");
        //用户输入的旧密码
        String oldPassword = pageData.getString("oldPassword");
        //用户id
        Integer userId = pageData.getIntegerVal("userId");

        //如果用户输入的新旧密码一样,提示用户密码不等相等
        Assert.isTrue(!newPassword.equals(oldPassword), "旧密码不能与新密码相等");
        try {
            //新的密码盐
            String salt = CommonsUtil.getRandomString(6);

            //根据用户id从数据库中查到用户,然后在判断用户输入的旧密码是否和数据中的密码一致
            MgUserInfo mgUserInfo = mgUserInfoGeneratorMapper.selectOneByExample(
                    new MgUserInfoExample().or().andIdEqualTo(userId).example()
            );
            //ff3b6a7c4a9280778d47839efad9d931
            //ff3b6a7c4a9280778d47839efad9d931
            oldPassword = MD5Util.getMd5(oldPassword, mgUserInfo.getUserPasswordSalt());
            Assert.isTrue(mgUserInfo.getUserPassword().equals(oldPassword), "请输入正确的密码!");

            //更改用户的密码
            mgUserInfoGeneratorMapper.updateByExampleSelective(
                    MgUserInfo
                            .builder()
                            .userPasswordSalt(salt)
                            .userPassword(MD5Util.getMd5(pageData.getString("oldPassword"), salt))
                            .build(), new MgUserInfoExample().or().andIdEqualTo(userId).example()
            );

            return JsonResult.<Boolean>success(true);
        } catch (ErrorException e) {
            log.error("修改用户密码时异常:{}", e.getMessage());
            return JsonResult.error(e.getMessage());
        } catch (Exception e) {
            log.error("修改用户密码时异常:{}", e.getMessage());
            return JsonResult.error("修改密码失败");
        }
    }

    @Override
    public JsonResult<Boolean> del(Integer... userId) {
        mgUserInfoGeneratorMapper.deleteByExample(
                new MgUserInfoExample()
                        .or()
                        .andIdIn(Arrays.asList(userId))
                        .example()
        );
        return JsonResult.<Boolean>success(true);
    }

    @Override
    public JsonResult<List<String>> role() {
        List<String> result = mgRoleGeneratorMapper.selectAll().stream().map(MgRole::getRoleName)
                .collect(Collectors.toList());
        return JsonResult.success(result);
    }

}
