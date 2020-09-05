package com.sakura.project.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgProjectFundsInfo;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/9/2 17:30
 */
public interface MgProjectFundsInfoService {

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
     * 创建项目
     * @param mgProjectFundsInfo
     * @return
     */
    JsonResult<Boolean> add(MgProjectFundsInfo mgProjectFundsInfo);

    /**
     * 修改项目
     * @param mgProjectFundsInfo
     * @return
     */
    JsonResult<Boolean> edit(MgProjectFundsInfo mgProjectFundsInfo);

    /**
     * 删除项目
     * @param id
     * @return
     */
    JsonResult<Boolean> del(Integer id);

}
