package com.sakura.project.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.page.PageMethod;
import com.sakura.project.common.enums.EnumProjectLeave;
import com.sakura.project.common.enums.EnumProjectStatus;
import com.sakura.project.common.exception.ErrorException;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgProjectFundsInfo;
import com.sakura.project.mapper.generator.MgProjectFundsInfoGeneratorMapper;
import com.sakura.project.service.MgProjectFundsInfoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/9/2 17:30
 */
@Slf4j
@Service
@Transactional(rollbackFor = {Exception.class, ErrorException.class})
public class MgProjectFundsInfoServiceImpl implements MgProjectFundsInfoService {

    @Autowired
    private MgProjectFundsInfoGeneratorMapper mgProjectFundsInfoGeneratorMapper;


    @Override
    public JsonResult<PageData> get(Integer projectId) {
        return JsonResult.success(mgProjectFundsInfoGeneratorMapper.get(projectId));
    }

    @Override
    public PageResult<PageData> list(Pageable pageable, PageData pageData) {
        PageMethod.startPage(pageable.getPageNumber(), pageable.getPageSize());

        List<PageData> list = mgProjectFundsInfoGeneratorMapper.list(pageData);
        Map<Integer, String> projectStatusMap = EnumProjectStatus.getMap();
        Map<Integer, String> projectLeaveMap = EnumProjectLeave.getMap();
        list.forEach(pd -> {
            pd.put("projectStatus", projectStatusMap.get(pd.getIntegerVal("projectStatus")));
            pd.put("projectLeave", projectLeaveMap.get(pd.getIntegerVal("projectLeave")));
        });
        return PageResult.success(list);
    }

    @Override
    public JsonResult<Boolean> add(MgProjectFundsInfo mgProjectFundsInfo) {
        try {
            mgProjectFundsInfoGeneratorMapper.insertSelective(mgProjectFundsInfo);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("发布资金类项目时异常:{}", e.getMessage());
            return JsonResult.error("发布资金类项目失败!");
        }
    }

    @Override
    public JsonResult<Boolean> edit(MgProjectFundsInfo mgProjectFundsInfo) {
        try {
            mgProjectFundsInfoGeneratorMapper.updateByPrimaryKeySelective(mgProjectFundsInfo);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("修改资金项目时异常:{}", e.getMessage());
            return JsonResult.error("修改项目失败!");
        }
    }

    @Override
    public JsonResult<Boolean> del(Integer id) {
        mgProjectFundsInfoGeneratorMapper.deleteByPrimaryKey(id);
        return JsonResult.success();
    }
}
