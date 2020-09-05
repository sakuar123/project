package com.sakura.project.mapper.generator;

import java.util.List;

import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult.Page;
import com.sakura.project.entity.MgProjectFundsInfo;
import com.sakura.project.entity.example.MgProjectFundsInfoExample;
import com.sakura.project.mapper.BaseGeneratorMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李七夜
 */
@Mapper
public interface MgProjectFundsInfoGeneratorMapper extends BaseGeneratorMapper<MgProjectFundsInfo> {

    /**
     * do some thing
     * @param example
     * @return
     */
    long countByExample(MgProjectFundsInfoExample example);

    /**
     * 获取项目详情
     * @param projectId
     * @return
     */
    PageData get(@Param("projectId") Integer projectId);

    /**
     * 分页列表
     * @param pageData
     * @return
     */
    List<PageData> list(PageData pageData);

}