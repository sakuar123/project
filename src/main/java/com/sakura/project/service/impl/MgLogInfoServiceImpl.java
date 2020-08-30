package com.sakura.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.github.pagehelper.page.PageMethod;
import com.sakura.project.common.dto.MgLogInfoDto;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.mapper.generator.MgLogGeneratorMapper;
import com.sakura.project.service.MgLogInfoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 15:48
 */
@Slf4j
@Service
public class MgLogInfoServiceImpl implements MgLogInfoService {

    @Autowired
    private MgLogGeneratorMapper mgLogGeneratorMapper;


    @Override
    public PageResult<MgLogInfoDto> list(Pageable pageable, PageData pageData) {
        //开启分页插件
        PageMethod.startPage(pageable.getPageNumber(), pageable.getPageSize());

        List<MgLogInfoDto> list = mgLogGeneratorMapper.list(pageData);

        return PageResult.success(list);
    }
}
