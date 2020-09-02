package com.sakura.project.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.page.PageMethod;
import com.sakura.project.common.exception.ErrorException;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.ObjectTools;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgSustainInfo;
import com.sakura.project.entity.MgSustainInfo.Column;
import com.sakura.project.entity.example.MgSustainInfoExample;
import com.sakura.project.mapper.generator.MgSustainInfoGeneratorMapper;
import com.sakura.project.service.MgSustainInfoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 17:53
 */
@Slf4j
@Service
@Transactional(rollbackFor = {Exception.class, ErrorException.class})
public class MgSustainInfoServiceImpl implements MgSustainInfoService {

    @Autowired
    private MgSustainInfoGeneratorMapper mgSustainInfoGeneratorMapper;

    @Override
    public PageResult<MgSustainInfo> list(Pageable pageable, PageData pageData) {
        PageMethod.startPage(pageable.getPageNumber(), pageable.getPageSize());

        MgSustainInfoExample.Criteria criteria = new MgSustainInfoExample()
                .orderBy(Column.id.desc())
                .or();
        if (ObjectTools.isNotBlank(pageData.getString("sustainName"))) {
            criteria.andSustainNameLike(StringUtils.join("%", pageData.getString("sustainName"), "%"));
        }
        List<MgSustainInfo> list = mgSustainInfoGeneratorMapper.selectByExample(criteria.example());
        return PageResult.success(list);
    }

    @Override
    public JsonResult<Boolean> add(MgSustainInfo mgSustainInfo) {
        try {
            mgSustainInfoGeneratorMapper.insertSelective(mgSustainInfo);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("添加方式时异常:{}", e.getMessage());
            return JsonResult.error("添加方式失败!");
        }
    }

    @Override
    public JsonResult<Boolean> edit(MgSustainInfo mgSustainInfo) {
        try {
            mgSustainInfoGeneratorMapper.updateByPrimaryKeySelective(mgSustainInfo);
            return JsonResult.success();
        } catch (Exception e) {
            log.error("修改方式时异常:{}", e.getMessage());
            return JsonResult.error("修改方式失败!");
        }
    }

    @Override
    public JsonResult<Boolean> del(Integer id) {
        mgSustainInfoGeneratorMapper.deleteByPrimaryKey(id);
        return JsonResult.success();
    }
}
