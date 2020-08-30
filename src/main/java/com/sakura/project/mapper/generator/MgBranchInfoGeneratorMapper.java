package com.sakura.project.mapper.generator;

import com.sakura.project.entity.MgBranchInfo;
import com.sakura.project.entity.example.MgBranchInfoExample;
import com.sakura.project.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MgBranchInfoGeneratorMapper extends BaseGeneratorMapper<MgBranchInfo> {
    long countByExample(MgBranchInfoExample example);
}