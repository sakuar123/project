package com.sakura.project.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgBranchInfo;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 18:18
 */
public interface MgBranchInfoService {

    /**
     * 分页列表
     * @param pageable
     * @param pageData
     * @return
     */
    PageResult<MgBranchInfo> list(Pageable pageable, PageData pageData);

    /**
     * 新增方式
     * @param mgBranchInfo
     * @return
     */
    JsonResult<Boolean> add(MgBranchInfo mgBranchInfo);

    /**
     * 修改方式
     * @param mgBranchInfo
     * @return
     */
    JsonResult<Boolean> edit(MgBranchInfo mgBranchInfo);

    /**
     * 删除方式
     * @param id
     * @return
     */
    JsonResult<Boolean> del(Integer id);

    /**
     * 部门下拉列表框
     * @return
     */
    JsonResult<List<PageData>> option();

}
