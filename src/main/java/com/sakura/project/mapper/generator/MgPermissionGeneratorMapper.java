package com.sakura.project.mapper.generator;

import com.sakura.project.entity.MgPermission;
import com.sakura.project.entity.example.MgPermissionExample;
import com.sakura.project.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MgPermissionGeneratorMapper extends BaseGeneratorMapper<MgPermission> {
    long countByExample(MgPermissionExample example);
}