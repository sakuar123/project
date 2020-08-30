package com.sakura.project.mapper.generator;

import com.sakura.project.entity.MgCompanyInfo;
import com.sakura.project.entity.example.MgCompanyInfoExample;
import com.sakura.project.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MgCompanyInfoGeneratorMapper extends BaseGeneratorMapper<MgCompanyInfo> {
    long countByExample(MgCompanyInfoExample example);
}