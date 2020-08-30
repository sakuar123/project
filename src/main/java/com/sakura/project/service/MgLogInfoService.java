package com.sakura.project.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project.common.dto.MgLogInfoDto;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 15:48
 */
public interface MgLogInfoService {

    /**
     * 分页查询
     * @param pageable
     * @param pageData
     * @return
     */
    PageResult<MgLogInfoDto> list(Pageable pageable, PageData pageData);

}
