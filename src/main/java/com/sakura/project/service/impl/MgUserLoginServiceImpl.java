package com.sakura.project.service.impl;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.sakura.project.common.enums.EnumJsonResultMsg;
import com.sakura.project.common.enums.EnumLoginType;
import com.sakura.project.common.enums.EnumState;
import com.sakura.project.common.util.Assert;
import com.sakura.project.common.util.CommonConstant;
import com.sakura.project.common.util.CommonsUtil;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.JwtUtil;
import com.sakura.project.common.util.MD5Util;
import com.sakura.project.common.util.ObjectTools;
import com.sakura.project.common.util.PageData;
import com.sakura.project.entity.MgUserInfo;
import com.sakura.project.entity.example.MgUserInfoExample;
import com.sakura.project.mapper.generator.MgUserInfoGeneratorMapper;
import com.sakura.project.service.MgUserLoginService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 14:54
 */
@Slf4j
@Service
public class MgUserLoginServiceImpl implements MgUserLoginService {

    @Autowired
    private MgUserInfoGeneratorMapper mgUserInfoGeneratorMapper;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    @Override
    public JsonResult<PageData> sendCaptcha(PageData pageData) {
        //用户输入的手机号
        String phone = pageData.getString("phone");

        MgUserInfo mgUserInfo = getUserByPhone(phone);
        Assert.isTrue(ObjectTools.isNotBlank(mgUserInfo), EnumJsonResultMsg.USER_PHONE_BAD);

        //要发送的验证码
        Long captcha = CommonsUtil.getRandomNumber(6);
        log.info("手机号:{},发送的验证码为:{}", phone, captcha);

        //将手机号放到缓存里,过期时间60S
        redisTemplate.opsForValue()
                .set(StringUtils.join(CommonConstant.REDIS_LOGIN_PHONE, phone), captcha.toString(), 60,
                        TimeUnit.SECONDS);

        PageData result = new PageData();
        result.put("captcha", captcha);

        return JsonResult.<PageData>success(result);
    }

    @Override
    public JsonResult<PageData> login(PageData pageData) {
        //登录类型
        String loginType = pageData.getString("loginType");
        //用户名
        String loginName = pageData.getString("loginName");
        //密码或者验证码
        String loginPwd = pageData.getString("loginPwd");
        //返回的结果
        PageData result = new PageData();
        //根据手机号查询到的用户信息
        MgUserInfo mgUserInfo = getUserByPhone(loginName);
        //验证码登录
        if (EnumLoginType.CAPTCHA.getLoginType().equals(loginType)) {
            //将缓存中的验证码取出,在与用户输入的验证码做比较,如果为空或者不一致,直接返回提示用户
            String redisCaptcha = redisTemplate.opsForValue()
                    .get(StringUtils.join(CommonConstant.REDIS_LOGIN_PHONE, loginName));
            Assert.isTrue(loginPwd.equals(redisCaptcha), EnumJsonResultMsg.USER_CAPTCHA_BAD);
            //删掉redis中的验证码缓存
            redisTemplate.delete(StringUtils.join(CommonConstant.REDIS_LOGIN_PHONE, loginName));
        } else {
            //密码登录
            Assert.isTrue(ObjectTools.isNotBlank(mgUserInfo), EnumJsonResultMsg.USER_PHONE_BAD);
            //将用户输入的密码加密后再与数据库中的密码做比较,
            String userPassword = MD5Util.getMd5(loginPwd, mgUserInfo.getUserPasswordSalt());
            Assert.isTrue(userPassword.equals(mgUserInfo.getUserPassword()), "密码错误!");
        }
        //生成token
        String token = JwtUtil.createJwt(JwtUtil.buildClaims(mgUserInfo.getId(), mgUserInfo.getUserName()));

        //将生成的token放入缓存中,有效期1小时
        redisTemplate.opsForValue()
                .set(StringUtils.join(CommonConstant.REDIS_USER_KEY, mgUserInfo.getId()), token, 1, TimeUnit.HOURS);

        result.put("user-token", token);
        return JsonResult.<PageData>success(result);
    }

    /**
     * 根据手机号获取用户信息
     * @param phone
     * @return
     */
    private MgUserInfo getUserByPhone(String phone) {
        return mgUserInfoGeneratorMapper.selectOneByExample(
                new MgUserInfoExample()
                        .or()
                        .andUserPhoneEqualTo(phone)
                        .andUserStateEqualTo(EnumState.USE.getIntValue())
                        .example()
        );
    }
}
