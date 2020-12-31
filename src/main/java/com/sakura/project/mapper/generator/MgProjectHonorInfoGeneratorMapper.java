package com.sakura.project.mapper.generator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sakura.project.common.util.PageData;
import com.sakura.project.entity.MgProjectHonorInfo;
import com.sakura.project.entity.example.MgProjectHonorInfoExample;
import com.sakura.project.mapper.BaseGeneratorMapper;

/**
 * @author 李七夜
 */
@Mapper
public interface MgProjectHonorInfoGeneratorMapper extends BaseGeneratorMapper<MgProjectHonorInfo> {

    /**
     * do some thing
     * @param example
     * @return
     */
    long countByExample(MgProjectHonorInfoExample example);

    /**
     * 项目详情
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