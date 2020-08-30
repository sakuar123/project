package com.sakura.project.mapper.generator;

import com.sakura.project.entity.MgDepartmentInfo;
import com.sakura.project.entity.example.MgDepartmentInfoExample;
import com.sakura.project.mapper.BaseGeneratorMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MgDepartmentInfoGeneratorMapper extends BaseGeneratorMapper<MgDepartmentInfo> {
    long countByExample(MgDepartmentInfoExample example);
}