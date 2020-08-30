package com.sakura.project.mapper.generator;

import java.util.List;

import com.sakura.project.common.dto.MgUserInfoDto;
import com.sakura.project.common.util.PageData;
import com.sakura.project.entity.MgUserInfo;
import com.sakura.project.entity.example.MgUserInfoExample;
import com.sakura.project.mapper.BaseGeneratorMapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MgUserInfoGeneratorMapper extends BaseGeneratorMapper<MgUserInfo> {

    /**
     * do something
     * @param example
     * @return
     */
    long countByExample(MgUserInfoExample example);

    /**
     * 分页查询
     * @param pageData
     * @return
     */
    List<MgUserInfoDto> list(PageData pageData);
}