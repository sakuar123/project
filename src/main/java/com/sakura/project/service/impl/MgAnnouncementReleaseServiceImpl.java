package com.sakura.project.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.page.PageMethod;
import com.sakura.project.common.dto.MgAnnouncementReleaseDto;
import com.sakura.project.common.enums.EnumProjectType;
import com.sakura.project.common.exception.ErrorException;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgAnnouncementRelease;
import com.sakura.project.mapper.generator.MgAnnouncementReleaseGeneratorMapper;
import com.sakura.project.service.MgAnnouncementReleaseService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/31 15:58
 */
@Slf4j
@Service
@Transactional(rollbackFor = {Exception.class, ErrorException.class})
public class MgAnnouncementReleaseServiceImpl implements MgAnnouncementReleaseService {

    @Autowired
    private MgAnnouncementReleaseGeneratorMapper mgAnnouncementReleaseGeneratorMapper;


    @Override
    public JsonResult<MgAnnouncementReleaseDto> get(Integer id) {
        PageData pageData = new PageData();
        pageData.put("id", id);
        return JsonResult.success(mgAnnouncementReleaseGeneratorMapper.list(pageData).get(0));
    }

    @Override
    public PageResult<MgAnnouncementReleaseDto> list(Pageable pageable, PageData pageData) {
        PageMethod.startPage(pageable.getPageNumber(), pageable.getPageSize());

        List<MgAnnouncementReleaseDto> list = mgAnnouncementReleaseGeneratorMapper.list(pageData);

        Map<Integer, String> projectTypeMap = EnumProjectType.getMap();
        list.forEach(mgAnnouncementReleaseDto -> {
            mgAnnouncementReleaseDto
                    .setAnnouncementTypeValue(projectTypeMap.get(mgAnnouncementReleaseDto.getAnnouncementType()));
        });

        return PageResult.success(list);
    }

    @Override
    public JsonResult<Boolean> add(MgAnnouncementRelease mgAnnouncementRelease) {
        try {
            mgAnnouncementReleaseGeneratorMapper.insertSelective(mgAnnouncementRelease);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("添加通知公告时异常:{}", e.getMessage());
            return JsonResult.fail("添加通知公告失败!");
        }
    }

    @Override
    public JsonResult<Boolean> edit(MgAnnouncementRelease mgAnnouncementRelease) {
        try {
            mgAnnouncementReleaseGeneratorMapper.updateByPrimaryKeySelective(mgAnnouncementRelease);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("修改通知公告时异常:{}", e.getMessage());
            return JsonResult.fail("修改通知公告失败!");
        }
    }

    @Override
    public JsonResult<Boolean> del(Integer id) {
        mgAnnouncementReleaseGeneratorMapper.deleteByPrimaryKey(id);
        return JsonResult.success();
    }
}
