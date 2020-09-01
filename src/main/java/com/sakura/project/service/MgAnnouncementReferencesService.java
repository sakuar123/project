package com.sakura.project.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project.common.dto.MgAnnouncementReferencesDto;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgAnnouncementReferences;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/9/1 14:56
 */
public interface MgAnnouncementReferencesService {

    /**
     * 分页列表
     * @param pageable
     * @param pageData
     * @return
     */
    PageResult<MgAnnouncementReferencesDto> list(Pageable pageable, PageData pageData);

    /**
     * 新上传资料
     * @param userId
     * @param mgAnnouncementReferences
     * @return
     */
    JsonResult<Boolean> add(Integer userId, MgAnnouncementReferences mgAnnouncementReferences);

    /**
     * 删除上传资料
     * @param id
     * @return
     */
    JsonResult<Boolean> del(Integer id);

}
