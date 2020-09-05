package com.sakura.project.mapper.generator;

import com.sakura.project.entity.MgRole;
import com.sakura.project.entity.example.MgRoleExample;
import com.sakura.project.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MgRoleGeneratorMapper extends BaseGeneratorMapper<MgRole> {
    long countByExample(MgRoleExample example);
}