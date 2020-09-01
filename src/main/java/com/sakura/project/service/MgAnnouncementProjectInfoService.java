package com.sakura.project.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project.common.dto.MgAnnouncementProjectInfoDto;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgAnnouncementProjectInfo;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/31 11:47
 */
public interface MgAnnouncementProjectInfoService {

    /**
     * 获取单个项目公告
     * @param id
     * @return
     */
    JsonResult<MgAnnouncementProjectInfoDto> get(Integer id);

    /**
     * 分页列表
     * @param pageable
     * @param pageData
     * @return
     */
    PageResult<MgAnnouncementProjectInfoDto> list(Pageable pageable, PageData pageData);

    /**
     * 发布新的项目公告
     * @param mgAnnouncementProjectInfo
     * @return
     */
    JsonResult<Boolean> add(MgAnnouncementProjectInfo mgAnnouncementProjectInfo);

    /**
     * 修改项目公告
     * @param mgAnnouncementProjectInfo
     * @return
     */
    JsonResult<Boolean> edit(MgAnnouncementProjectInfo mgAnnouncementProjectInfo);

    /**
     * 删除项目公告
     * @param id
     * @return
     */
    JsonResult<Boolean> del(Integer id);

}
