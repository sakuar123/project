package com.sakura.project.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgProjectHonorInfo;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/9/5 16:11
 */
public interface MgProjectHonorInfoService {

    /**
     * 获取项目详情
     * @param projectId
     * @return
     */
    JsonResult<PageData> get(Integer projectId);

    /**
     * 分页列表
     * @param pageable
     * @param pageData
     * @return
     */
    PageResult<PageData> list(Pageable pageable, PageData pageData);

    /**
     * 发布项目
     * @param mgProjectHonorInfo
     * @return
     */
    JsonResult<Boolean> add(MgProjectHonorInfo mgProjectHonorInfo);

    /**
     * 修改项目
     * @param mgProjectHonorInfo
     * @return
     */
    JsonResult<Boolean> edit(MgProjectHonorInfo mgProjectHonorInfo);

    /**
     * 删除项目
     * @param projectId
     * @return
     */
    JsonResult<Boolean> del(Integer projectId);

}
