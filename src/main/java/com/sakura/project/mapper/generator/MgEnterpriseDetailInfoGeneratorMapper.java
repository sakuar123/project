package com.sakura.project.mapper.generator;

import com.sakura.project.entity.MgEnterpriseDetailInfo;
import com.sakura.project.entity.example.MgEnterpriseDetailInfoExample;
import com.sakura.project.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MgEnterpriseDetailInfoGeneratorMapper extends BaseGeneratorMapper<MgEnterpriseDetailInfo> {
    long countByExample(MgEnterpriseDetailInfoExample example);
}