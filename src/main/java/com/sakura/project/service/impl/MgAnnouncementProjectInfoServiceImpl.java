package com.sakura.project.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.page.PageMethod;
import com.sakura.project.common.dto.MgAnnouncementProjectInfoDto;
import com.sakura.project.common.enums.EnumProjectType;
import com.sakura.project.common.exception.ErrorException;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgAnnouncementProjectInfo;
import com.sakura.project.mapper.generator.MgAnnouncementProjectInfoGeneratorMapper;
import com.sakura.project.service.MgAnnouncementProjectInfoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/31 11:47
 */
@Slf4j
@Service
@Transactional(rollbackFor = {Exception.class, ErrorException.class})
public class MgAnnouncementProjectInfoServiceImpl implements MgAnnouncementProjectInfoService {

    @Autowired
    private MgAnnouncementProjectInfoGeneratorMapper mgAnnouncementProjectInfoGeneratorMapper;

    @Override
    public JsonResult<MgAnnouncementProjectInfoDto> get(Integer id) {
        PageData pageData = new PageData();
        pageData.put("id", id);
        return JsonResult.success(mgAnnouncementProjectInfoGeneratorMapper.list(pageData).get(0));
    }

    @Override
    public PageResult<MgAnnouncementProjectInfoDto> list(Pageable pageable, PageData pageData) {
        PageMethod.startPage(pageable.getPageNumber(), pageable.getPageSize());

        List<MgAnnouncementProjectInfoDto> list = mgAnnouncementProjectInfoGeneratorMapper.list(pageData);

        Map<Integer, String> projectTypeMap = EnumProjectType.getMap();
        list.forEach(mgAnnouncementProjectInfoDto -> {
            mgAnnouncementProjectInfoDto
                    .setProjectTypeValue(projectTypeMap.get(mgAnnouncementProjectInfoDto.getProjectType()));
        });

        return PageResult.success(list);
    }

    @Override
    public JsonResult<Boolean> add(MgAnnouncementProjectInfo mgAnnouncementProjectInfo) {
        try {
            mgAnnouncementProjectInfoGeneratorMapper.insertSelective(mgAnnouncementProjectInfo);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("添加项目公告时异常:{}", e.getMessage());
            return JsonResult.fail("添加项目公告失败!");
        }
    }

    @Override
    public JsonResult<Boolean> edit(MgAnnouncementProjectInfo mgAnnouncementProjectInfo) {
        try {
            mgAnnouncementProjectInfoGeneratorMapper.updateByPrimaryKeySelective(mgAnnouncementProjectInfo);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("修改项目公告时异常:{}", e.getMessage());
            return JsonResult.fail("修改项目公告失败!");
        }
    }

    @Override
    public JsonResult<Boolean> del(Integer id) {
        mgAnnouncementProjectInfoGeneratorMapper.deleteByPrimaryKey(id);
        return JsonResult.success();
    }
}
