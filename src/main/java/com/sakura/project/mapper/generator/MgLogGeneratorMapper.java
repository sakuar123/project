package com.sakura.project.mapper.generator;

import java.util.List;

import com.sakura.project.common.dto.MgLogInfoDto;
import com.sakura.project.common.util.PageData;
import com.sakura.project.entity.MgLog;
import com.sakura.project.entity.example.MgLogExample;
import com.sakura.project.mapper.BaseGeneratorMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author 李七夜
 */
@Mapper
public interface MgLogGeneratorMapper extends BaseGeneratorMapper<MgLog> {

    /**
     * do something
     * @param example
     * @return
     */
    long countByExample(MgLogExample example);

    /**
     * 分页查询
     * @param pageData
     * @return
     */
    List<MgLogInfoDto> list(PageData pageData);
}