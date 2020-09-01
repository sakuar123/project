package com.sakura.project.mapper.generator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sakura.project.common.dto.MgAnnouncementProjectInfoDto;
import com.sakura.project.common.util.PageData;
import com.sakura.project.entity.MgAnnouncementProjectInfo;
import com.sakura.project.entity.example.MgAnnouncementProjectInfoExample;
import com.sakura.project.mapper.BaseGeneratorMapper;

@Mapper
public interface MgAnnouncementProjectInfoGeneratorMapper extends BaseGeneratorMapper<MgAnnouncementProjectInfo> {

    /**
     * do some thing
     * @param example
     * @return
     */
    long countByExample(MgAnnouncementProjectInfoExample example);

    /**
     * 分页列表
     * @param pageData
     * @return
     */
    List<MgAnnouncementProjectInfoDto> list(PageData pageData);
}