package com.sakura.project.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project.common.dto.MgAnnouncementReleaseDto;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgAnnouncementRelease;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/31 15:58
 */
public interface MgAnnouncementReleaseService {

    /**
     * 获取单个通知公告
     * @param id
     * @return
     */
    JsonResult<MgAnnouncementReleaseDto> get(Integer id);

    /**
     * 分页列表
     * @param pageable
     * @param pageData
     * @return
     */
    PageResult<MgAnnouncementReleaseDto> list(Pageable pageable, PageData pageData);

    /**
     * 发布新的通知公告
     * @param mgAnnouncementRelease
     * @return
     */
    JsonResult<Boolean> add(MgAnnouncementRelease mgAnnouncementRelease);

    /**
     * 修改通知公告
     * @param mgAnnouncementRelease
     * @return
     */
    JsonResult<Boolean> edit(MgAnnouncementRelease mgAnnouncementRelease);

    /**
     * 删除通知公告
     * @param id
     * @return
     */
    JsonResult<Boolean> del(Integer id);
}
