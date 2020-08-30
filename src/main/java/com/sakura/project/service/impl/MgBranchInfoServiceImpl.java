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
import com.sakura.project.entity.MgBranchInfo;
import com.sakura.project.entity.MgBranchInfo.Column;
import com.sakura.project.entity.example.MgBranchInfoExample;
import com.sakura.project.mapper.generator.MgBranchInfoGeneratorMapper;
import com.sakura.project.service.MgBranchInfoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 18:18
 */
@Slf4j
@Service
@Transactional(rollbackFor = {Exception.class, ErrorException.class})
public class MgBranchInfoServiceImpl implements MgBranchInfoService {

    @Autowired
    private MgBranchInfoGeneratorMapper mgBranchInfoGeneratorMapper;


    @Override
    public PageResult<MgBranchInfo> list(Pageable pageable, PageData pageData) {
        PageMethod.startPage(pageable.getPageNumber(), pageable.getPageSize());

        MgBranchInfoExample.Criteria criteria = new MgBranchInfoExample()
                .orderBy(Column.id.desc())
                .or();
        if (ObjectTools.isNotBlank(pageData.getString("branchName"))) {
            criteria.andBranchNameLike(StringUtils.join("%", pageData.getString("branchName"), "%"));
        }
        List<MgBranchInfo> list = mgBranchInfoGeneratorMapper.selectByExample(criteria.example());
        return PageResult.success(list);
    }

    @Override
    public JsonResult<Boolean> add(MgBranchInfo mgBranchInfo) {
        try {
            mgBranchInfoGeneratorMapper.insertSelective(mgBranchInfo);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("添加部门时异常:{}", e.getMessage());
            return JsonResult.fail("添加部门失败!");
        }
    }

    @Override
    public JsonResult<Boolean> edit(MgBranchInfo mgBranchInfo) {
        try {
            mgBranchInfoGeneratorMapper.updateByPrimaryKeySelective(mgBranchInfo);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("修改部门时异常:{}", e.getMessage());
            return JsonResult.fail("修改部门失败!");
        }
    }

    @Override
    public JsonResult<Boolean> del(Integer id) {
        mgBranchInfoGeneratorMapper.deleteByPrimaryKey(id);
        return JsonResult.success();
    }
}
