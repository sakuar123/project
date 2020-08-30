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
import com.sakura.project.entity.MgDepartmentInfo;
import com.sakura.project.entity.MgDepartmentInfo.Column;
import com.sakura.project.entity.example.MgDepartmentInfoExample;
import com.sakura.project.mapper.generator.MgDepartmentInfoGeneratorMapper;
import com.sakura.project.service.MgDepartmentInfoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 17:26
 */
@Slf4j
@Service
@Transactional(rollbackFor = {Exception.class, ErrorException.class})
public class MgDepartmentInfoServiceImpl implements MgDepartmentInfoService {

    @Autowired
    private MgDepartmentInfoGeneratorMapper mgDepartmentInfoGeneratorMapper;


    @Override
    public PageResult<MgDepartmentInfo> list(Pageable pageable, PageData pageData) {
        PageMethod.startPage(pageable.getPageNumber(), pageable.getPageSize());

        MgDepartmentInfoExample.Criteria criteria = new MgDepartmentInfoExample()
                .orderBy(Column.id.desc())
                .or();

        if (ObjectTools.isNotBlank(pageData.getString("departmentName"))) {
            criteria.andDepartmentNameLike(StringUtils.join("%", pageData.getString("departmentName"), "%"));
        }
        List<MgDepartmentInfo> list = mgDepartmentInfoGeneratorMapper.selectByExample(criteria.example());
        return PageResult.success(list);
    }

    @Override
    public JsonResult<Boolean> add(MgDepartmentInfo mgDepartmentInfo) {
        try {
            mgDepartmentInfoGeneratorMapper.insertSelective(mgDepartmentInfo);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("添加科室时异常:{}", e.getMessage());
            return JsonResult.fail("添加科室失败!");
        }
    }

    @Override
    public JsonResult<Boolean> edit(MgDepartmentInfo mgDepartmentInfo) {
        try {
            mgDepartmentInfoGeneratorMapper.updateByPrimaryKeySelective(mgDepartmentInfo);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("修改科室时异常:{}", e.getMessage());
            return JsonResult.fail("修改科室失败!");
        }
    }

    @Override
    public JsonResult<Boolean> del(Integer id) {
        mgDepartmentInfoGeneratorMapper.deleteByPrimaryKey(id);
        return JsonResult.success();
    }
}
