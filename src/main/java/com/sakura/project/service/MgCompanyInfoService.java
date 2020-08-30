package com.sakura.project.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgCompanyInfo;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 16:03
 */
public interface MgCompanyInfoService {


    /**
     * 分页列表
     * @param pageable
     * @param pageData
     * @return
     */
    PageResult<MgCompanyInfo> list(Pageable pageable, PageData pageData);

    /**
     * 新增公司
     * @param mgCompanyInfo
     * @return
     */
    JsonResult<Boolean> add(MgCompanyInfo mgCompanyInfo);

    /**
     * 修改公司
     * @param mgCompanyInfo
     * @return
     */
    JsonResult<Boolean> update(MgCompanyInfo mgCompanyInfo);

    /**
     * 删除公司
     * @param id
     * @return
     */
    JsonResult<Boolean> del(Integer id);

}
