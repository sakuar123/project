package com.sakura.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.page.PageMethod;
import com.sakura.project.common.dto.MgAnnouncementReferencesDto;
import com.sakura.project.common.exception.ErrorException;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgAnnouncementReferences;
import com.sakura.project.mapper.generator.MgAnnouncementReferencesGeneratorMapper;
import com.sakura.project.mapper.generator.MgUserInfoGeneratorMapper;
import com.sakura.project.service.MgAnnouncementReferencesService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/9/1 14:56
 */
@Slf4j
@Service
@Transactional(rollbackFor = {Exception.class, ErrorException.class})
public class MgAnnouncementReferencesServiceImpl implements MgAnnouncementReferencesService {

    @Autowired
    private MgAnnouncementReferencesGeneratorMapper mgAnnouncementReferencesGeneratorMapper;
    @Autowired
    private MgUserInfoGeneratorMapper mgUserInfoGeneratorMapper;

    @Override
    public PageResult<MgAnnouncementReferencesDto> list(Pageable pageable, PageData pageData) {
        PageMethod.startPage(pageable.getPageNumber(), pageable.getPageSize());

        List<MgAnnouncementReferencesDto> list = mgAnnouncementReferencesGeneratorMapper.list(pageData);

        return PageResult.success(list);
    }

    @Override
    public JsonResult<Boolean> add(Integer userId, MgAnnouncementReferences mgAnnouncementReferences) {
        try {
            mgAnnouncementReferences.setUploadCompany(getCompanyId(userId));
            mgAnnouncementReferencesGeneratorMapper.insertSelective(mgAnnouncementReferences);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("上传资料时异常:{}", e.getMessage());
            return JsonResult.fail("上传资料失败!");
        }
    }

    @Override
    public JsonResult<Boolean> del(Integer id) {
        mgUserInfoGeneratorMapper.deleteByPrimaryKey(id);
        return JsonResult.success();
    }

    private Integer getCompanyId(Integer userId) {
        return mgUserInfoGeneratorMapper.selectByPrimaryKey(userId).getCompanyId();
    }
}
