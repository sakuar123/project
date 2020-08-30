package com.sakura.project.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgSustainInfo;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 17:53
 */
public interface MgSustainInfoService {

    /**
     * 分页列表
     * @param pageable
     * @param pageData
     * @return
     */
    PageResult<MgSustainInfo> list(Pageable pageable, PageData pageData);

    /**
     * 新增方式
     * @param mgSustainInfo
     * @return
     */
    JsonResult<Boolean> add(MgSustainInfo mgSustainInfo);

    /**
     * 修改方式
     * @param mgSustainInfo
     * @return
     */
    JsonResult<Boolean> edit(MgSustainInfo mgSustainInfo);

    /**
     * 删除方式
     * @param id
     * @return
     */
    JsonResult<Boolean> del(Integer id);
}
