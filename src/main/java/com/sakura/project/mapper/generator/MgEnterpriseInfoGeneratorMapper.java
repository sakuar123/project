package com.sakura.project.mapper.generator;

import com.sakura.project.common.dto.MgEnterpriseInfoDto;
import com.sakura.project.entity.MgEnterpriseInfo;
import com.sakura.project.entity.example.MgEnterpriseInfoExample;
import com.sakura.project.mapper.BaseGeneratorMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李七夜
 */
@Mapper
public interface MgEnterpriseInfoGeneratorMapper extends BaseGeneratorMapper<MgEnterpriseInfo> {

    /**
     * do something
     * @param example
     * @return
     */
    long countByExample(MgEnterpriseInfoExample example);

    /**
     * 获取企业详情信息
     * @param id
     * @return
     */
    MgEnterpriseInfoDto get(@Param("id") Integer id);
}