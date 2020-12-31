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
import com.sakura.project.entity.MgProjectHonorInfo;
import com.sakura.project.mapper.generator.MgProjectHonorInfoGeneratorMapper;
import com.sakura.project.service.MgProjectHonorInfoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/9/5 16:11
 */
@Slf4j
@Service
@Transactional(rollbackFor = {Exception.class, ErrorException.class})
public class MgProjectHonorInfoServiceImpl implements MgProjectHonorInfoService {

    @Autowired
    private MgProjectHonorInfoGeneratorMapper mgProjectHonorInfoGeneratorMapper;


    @Override
    public JsonResult<PageData> get(Integer projectId) {
        return JsonResult.success(mgProjectHonorInfoGeneratorMapper.get(projectId));
    }

    @Override
    public PageResult<PageData> list(Pageable pageable, PageData pageData) {

        PageMethod.startPage(pageable.getPageNumber(), pageable.getPageSize());

        List<PageData> list = mgProjectHonorInfoGeneratorMapper.list(pageData);
        Map<Integer, String> projectStatusMap = EnumProjectStatus.getMap();
        Map<Integer, String> projectLeaveMap = EnumProjectLeave.getMap();
        list.forEach(pd -> {
            pd.put("projectStatus", projectStatusMap.get(pd.getIntegerVal("projectStatus")));
            pd.put("projectLeave", projectLeaveMap.get(pd.getIntegerVal("projectLeave")));
        });
        return PageResult.success(list);
    }

    @Override
    public JsonResult<Boolean> add(MgProjectHonorInfo mgProjectHonorInfo) {
        try {
            mgProjectHonorInfoGeneratorMapper.insertSelective(mgProjectHonorInfo);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("添加荣誉类项目时异常:{}", e.getMessage());
            return JsonResult.error("发布项目失败!");
        }
    }

    @Override
    public JsonResult<Boolean> edit(MgProjectHonorInfo mgProjectHonorInfo) {
        try {
            mgProjectHonorInfoGeneratorMapper.updateByPrimaryKeySelective(mgProjectHonorInfo);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("修改荣誉类项目时异常:{}", e.getMessage());
            return JsonResult.error("修改项目失败!");
        }
    }

    @Override
    public JsonResult<Boolean> del(Integer projectId) {
        mgProjectHonorInfoGeneratorMapper.deleteByPrimaryKey(projectId);
        return JsonResult.success();
    }
}
