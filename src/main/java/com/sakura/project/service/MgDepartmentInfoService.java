package com.sakura.project.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgDepartmentInfo;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 17:26
 */
public interface MgDepartmentInfoService {

    /**
     * 分页列表
     * @param pageable
     * @param pageData
     * @return
     */
    PageResult<MgDepartmentInfo> list(Pageable pageable, PageData pageData);

    /**
     * 新增科室
     * @param mgDepartmentInfo
     * @return
     */
    JsonResult<Boolean> add(MgDepartmentInfo mgDepartmentInfo);

    /**
     * 修改科室
     * @param mgDepartmentInfo
     * @return
     */
    JsonResult<Boolean> edit(MgDepartmentInfo mgDepartmentInfo);

    /**
     * 删除科室
     * @param id
     * @return
     */
    JsonResult<Boolean> del(Integer id);

    /**
     * 科室下拉列表
     * @return
     */
    JsonResult<List<PageData>> option();

}
