package com.sakura.project.mapper.generator;

import com.sakura.project.entity.MgRolePermission;
import com.sakura.project.entity.example.MgRolePermissionExample;
import com.sakura.project.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MgRolePermissionGeneratorMapper extends BaseGeneratorMapper<MgRolePermission> {
    long countByExample(MgRolePermissionExample example);
}