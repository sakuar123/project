package com.sakura.project.mapper.generator;

import java.util.List;

import com.sakura.project.common.dto.MgAnnouncementReleaseDto;
import com.sakura.project.common.util.PageData;
import com.sakura.project.entity.MgAnnouncementRelease;
import com.sakura.project.entity.example.MgAnnouncementReleaseExample;
import com.sakura.project.mapper.BaseGeneratorMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author 李七夜
 */
@Mapper
public interface MgAnnouncementReleaseGeneratorMapper extends BaseGeneratorMapper<MgAnnouncementRelease> {

    /**
     * do some thing
     * @param example
     * @return
     */
    long countByExample(MgAnnouncementReleaseExample example);

    /**
     * 分页列表
     * @param pageData
     * @return
     */
    List<MgAnnouncementReleaseDto> list(PageData pageData);
}