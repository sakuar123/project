package com.sakura.project.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.page.PageMethod;
import com.sakura.project.common.exception.ErrorException;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.ObjectTools;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgCompanyInfo;
import com.sakura.project.entity.MgCompanyInfo.Column;
import com.sakura.project.entity.example.MgCompanyInfoExample;
import com.sakura.project.mapper.generator.MgCompanyInfoGeneratorMapper;
import com.sakura.project.service.MgCompanyInfoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 16:03
 */
@Slf4j
@Service
@Transactional(rollbackFor = {Exception.class, ErrorException.class})
public class MgCompanyInfoServiceImpl implements MgCompanyInfoService {

    @Autowired
    private MgCompanyInfoGeneratorMapper mgCompanyInfoGeneratorMapper;

    @Override
    public PageResult<MgCompanyInfo> list(Pageable pageable, PageData pageData) {
        //开启分页插件
        PageMethod.startPage(pageable.getPageNumber(), pageable.getPageSize());

        MgCompanyInfoExample.Criteria criteria = new MgCompanyInfoExample()
                .orderBy(Column.id.desc())
                .or();
        //公司名称
        if (ObjectTools.isNotBlank(pageData.getString(Column.companyName.getJavaProperty()))) {
            criteria.andCompanyNameLike(
                    StringUtils.join("%", pageData.getString(Column.companyName.getJavaProperty()), "%"));
        }
        List<MgCompanyInfo> list = mgCompanyInfoGeneratorMapper.selectByExample(criteria.example());
        return PageResult.success(list);
    }

    @Override
    public JsonResult<Boolean> add(MgCompanyInfo mgCompanyInfo) {
        try {
            mgCompanyInfoGeneratorMapper.insertSelective(mgCompanyInfo);
            return JsonResult.<Boolean>success();
        } catch (Exception e) {
            log.error("新增公司时异常:{}", e.getMessage());
            return JsonResult.<Boolean>fail("添加公司失败!");
        }
    }

    @Override
    public JsonResult<Boolean> update(MgCompanyInfo mgCompanyInfo) {
        try {
            mgCompanyInfoGeneratorMapper.updateByPrimaryKeySelective(mgCompanyInfo);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("修改公司信息时异常:{}", e.getMessage());
            return JsonResult.fail("修改公司信息失败");
        }
    }

    @Override
    public JsonResult<Boolean> del(Integer id) {
        mgCompanyInfoGeneratorMapper.deleteByPrimaryKey(id);
        return JsonResult.success();
    }
}
