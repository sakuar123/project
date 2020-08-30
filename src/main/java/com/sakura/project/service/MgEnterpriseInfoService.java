package com.sakura.project.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project.common.dto.MgEnterpriseInfoDto;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgEnterpriseInfo;
import com.sakura.project.web.vo.enterprise.MgEnterpriseDetailInfoVo;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/29 15:56
 */
public interface MgEnterpriseInfoService {

    /**
     * 获取企业详情
     * @param enterpriseId
     * @return
     */
    JsonResult<MgEnterpriseInfoDto> get(Integer enterpriseId);

    /**
     * 分页列表
     * @param pageable
     * @param pageData
     * @return
     */
    PageResult<MgEnterpriseInfo> list(Pageable pageable, PageData pageData);

    /**
     * 新增
     * @param mgEnterpriseDetailInfoVo
     * @return
     */
    JsonResult<Boolean> add(MgEnterpriseDetailInfoVo mgEnterpriseDetailInfoVo);

    /**
     * 修改
     * @param mgEnterpriseDetailInfoVo
     * @return
     */
    JsonResult<Boolean> update(Integer enterpriseId, MgEnterpriseDetailInfoVo mgEnterpriseDetailInfoVo);

    /**
     * 删除
     * @param id
     * @return
     */
    JsonResult<Boolean> del(Integer id);

}
