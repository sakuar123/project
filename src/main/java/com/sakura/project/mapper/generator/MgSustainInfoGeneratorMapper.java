package com.sakura.project.mapper.generator;

import com.sakura.project.entity.MgSustainInfo;
import com.sakura.project.entity.example.MgSustainInfoExample;
import com.sakura.project.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MgSustainInfoGeneratorMapper extends BaseGeneratorMapper<MgSustainInfo> {
    long countByExample(MgSustainInfoExample example);
}