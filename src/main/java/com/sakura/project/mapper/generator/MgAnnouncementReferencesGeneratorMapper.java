package com.sakura.project.mapper.generator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sakura.project.common.dto.MgAnnouncementReferencesDto;
import com.sakura.project.common.util.PageData;
import com.sakura.project.entity.MgAnnouncementReferences;
import com.sakura.project.entity.example.MgAnnouncementReferencesExample;
import com.sakura.project.mapper.BaseGeneratorMapper;

/**
 * @author 李七夜
 */
@Mapper
public interface MgAnnouncementReferencesGeneratorMapper extends BaseGeneratorMapper<MgAnnouncementReferences> {

    /**
     * do some thing
     * @param example
     * @return
     */
    long countByExample(MgAnnouncementReferencesExample example);

    /**
     * 分页列表
     * @param pageData
     * @return
     */
    List<MgAnnouncementReferencesDto> list(PageData pageData);
}