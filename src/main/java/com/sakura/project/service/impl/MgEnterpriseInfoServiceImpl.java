package com.sakura.project.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.page.PageMethod;
import com.sakura.project.common.dto.MgEnterpriseInfoDto;
import com.sakura.project.common.exception.ErrorException;
import com.sakura.project.common.util.Assert;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.ObjectTools;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgEnterpriseDetailInfo;
import com.sakura.project.entity.MgEnterpriseInfo;
import com.sakura.project.entity.MgEnterpriseInfo.Column;
import com.sakura.project.entity.example.MgEnterpriseDetailInfoExample;
import com.sakura.project.entity.example.MgEnterpriseInfoExample;
import com.sakura.project.mapper.generator.MgEnterpriseDetailInfoGeneratorMapper;
import com.sakura.project.mapper.generator.MgEnterpriseInfoGeneratorMapper;
import com.sakura.project.service.MgEnterpriseInfoService;
import com.sakura.project.web.vo.enterprise.MgEnterpriseDetailInfoVo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/29 15:56
 */
@Slf4j
@Service
@Transactional(rollbackFor = {Exception.class, ErrorException.class})
public class MgEnterpriseInfoServiceImpl implements MgEnterpriseInfoService {

    @Autowired
    private MgEnterpriseInfoGeneratorMapper mgEnterpriseInfoGeneratorMapper;
    @Autowired
    private MgEnterpriseDetailInfoGeneratorMapper mgEnterpriseDetailInfoGeneratorMapper;

    @Override
    public JsonResult<MgEnterpriseInfoDto> get(Integer enterpriseId) {
        return JsonResult.success(mgEnterpriseInfoGeneratorMapper.get(enterpriseId));
    }

    @Override
    public PageResult<MgEnterpriseInfo> list(Pageable pageable, PageData pageData) {

        PageMethod.startPage(pageable.getPageNumber(), pageable.getPageSize());

        MgEnterpriseInfoExample.Criteria criteria = new MgEnterpriseInfoExample()
                .orderBy(Column.id.desc())
                .or();

        //企业名称
        if (ObjectTools.isNotBlank(pageData.getString(Column.enterpriseName.getJavaProperty()))) {
            criteria.andEnterpriseNameLike(
                    StringUtils.join("%", pageData.getString(Column.enterpriseName.getJavaProperty()), "%"));
        }

        //企业法人
        if (ObjectTools.isNotBlank(pageData.getString(Column.enterpriseLegalPerson.getJavaProperty()))) {
            criteria.andEnterpriseLegalPersonLike(
                    StringUtils.join("%", pageData.getString(Column.enterpriseLegalPerson.getJavaProperty()), "%"));
        }

        //企业电话
        if (ObjectTools.isNotBlank(pageData.getString(Column.enterprisePhone.getJavaProperty()))) {
            criteria.andEnterprisePhoneLike(
                    StringUtils.join("%", pageData.getString(Column.enterprisePhone.getJavaProperty()), "%"));
        }

        //企业社会信用代码
        if (ObjectTools.isNotBlank(pageData.getString(Column.enterpriseTaxpayerId.getJavaProperty()))) {
            criteria.andEnterpriseTaxpayerIdLike(
                    StringUtils.join("%", pageData.getString(Column.enterpriseTaxpayerId.getJavaProperty()), "%"));
        }

        List<MgEnterpriseInfo> list = mgEnterpriseInfoGeneratorMapper.selectByExample(criteria.example());

        return PageResult.success(list);
    }

    @Override
    public JsonResult<Boolean> add(MgEnterpriseDetailInfoVo mgEnterpriseDetailInfoVo) {
        try {
            //添加项目主表
            Integer enterpriseId = addMgEnterpriseInfo(mgEnterpriseDetailInfoVo);
            Assert.isTrue(enterpriseId > 0, "添加企业信息失败!");

            //添加项目详情表
            boolean flag = addMgEnterpriseDetailInfo(enterpriseId, mgEnterpriseDetailInfoVo);
            Assert.isTrue(flag, "添加项目详情失败!");

            return JsonResult.<Boolean>success(true);
        } catch (Exception e) {
            log.error("新增项目时异常:{}", e.getMessage());
            return JsonResult.<Boolean>fail("新增项目失败!");
        }
    }

    @Override
    public JsonResult<Boolean> update(Integer enterpriseId, MgEnterpriseDetailInfoVo mgEnterpriseDetailInfoVo) {
        try {
            Assert.isTrue(updateMgEnterpriseInfo(enterpriseId, mgEnterpriseDetailInfoVo), "修改企业基本信息失败!");
            Assert.isTrue(updateMgEnterpriseDetailInfo(enterpriseId, mgEnterpriseDetailInfoVo), "修改企业详情信息失败!");
            return JsonResult.<Boolean>success();
        } catch (Exception e) {
            log.error("修改企业信息异常:{}", e.getMessage());
            return JsonResult.fail("修改企业信息失败!");
        }
    }

    @Override
    public JsonResult<Boolean> del(Integer id) {
        try {
            mgEnterpriseInfoGeneratorMapper.deleteByPrimaryKey(id);
            mgEnterpriseDetailInfoGeneratorMapper.deleteByPrimaryKey(id);
            return JsonResult.<Boolean>success();
        } catch (Exception e) {
            log.error("删除企业信息时异常:{}", e.getMessage());
            return JsonResult.fail("删除企业失败!");
        }
    }

    private Integer addMgEnterpriseInfo(MgEnterpriseDetailInfoVo mgEnterpriseDetailInfoVo) {
        try {
            MgEnterpriseInfo mgEnterpriseInfo = MgEnterpriseInfo
                    .builder()
                    .enterpriseLegalPerson(mgEnterpriseDetailInfoVo.getEnterpriseLegalPerson())
                    .enterpriseName(mgEnterpriseDetailInfoVo.getEnterpriseName())
                    .enterpriseNature(mgEnterpriseDetailInfoVo.getEnterpriseNature())
                    .enterprisePhone(mgEnterpriseDetailInfoVo.getEnterprisePhone())
                    .enterprisePrincipal(mgEnterpriseDetailInfoVo.getEnterprisePrincipal())
                    .enterpriseTaxpayerId(mgEnterpriseDetailInfoVo.getEnterpriseTaxpayerId())
                    .build();
            mgEnterpriseInfoGeneratorMapper.insertSelective(mgEnterpriseInfo);
            return mgEnterpriseInfo.getId();
        } catch (Exception e) {
            log.error("添加企业信息表时异常:{}", e.getMessage());
            return 0;
        }
    }

    private boolean addMgEnterpriseDetailInfo(Integer enterpriseId, MgEnterpriseDetailInfoVo mgEnterpriseDetailInfoVo) {
        try {
            MgEnterpriseDetailInfo mgEnterpriseDetailInfo = MgEnterpriseDetailInfo
                    .builder()
                    .enterpriseAccount(mgEnterpriseDetailInfoVo.getEnterpriseAccount())
                    .enterpriseBankAccount(mgEnterpriseDetailInfoVo.getEnterpriseBankAccount())
                    .enterpriseBusinessScope(mgEnterpriseDetailInfoVo.getEnterpriseBusinessScope())
                    .enterpriseId(enterpriseId)
                    .enterpriseOwnershipStructure(mgEnterpriseDetailInfoVo.getEnterpriseOwnershipStructure())
                    .enterpriseProfile(mgEnterpriseDetailInfoVo.getEnterpriseProfile())
                    .enterpriseRegisterDate(mgEnterpriseDetailInfoVo.getEnterpriseRegisterDate())
                    .enterpriseUrl(mgEnterpriseDetailInfoVo.getEnterpriseUrl())
                    .build();
            mgEnterpriseDetailInfoGeneratorMapper.insertSelective(mgEnterpriseDetailInfo);
            return ObjectTools.isNotBlank(mgEnterpriseDetailInfo.getId()) && mgEnterpriseDetailInfo.getId() > 0;
        } catch (Exception e) {
            log.error("添加企业详情时异常:{}", e.getMessage());
            return false;
        }
    }

    private boolean updateMgEnterpriseInfo(Integer enterpriseId, MgEnterpriseDetailInfoVo mgEnterpriseDetailInfoVo) {
        MgEnterpriseInfo mgEnterpriseInfo = new MgEnterpriseInfo();
        mgEnterpriseInfo.setId(enterpriseId);
        BeanUtils.copyProperties(mgEnterpriseDetailInfoVo, mgEnterpriseInfo);
        try {
            mgEnterpriseInfoGeneratorMapper.updateByPrimaryKeySelective(mgEnterpriseInfo);
            return true;
        } catch (Exception e) {
            log.error("修改企业信息时异常:{}", e.getMessage());
            return false;
        }
    }

    private boolean updateMgEnterpriseDetailInfo(Integer enterpriseId,
            MgEnterpriseDetailInfoVo mgEnterpriseDetailInfoVo) {
        MgEnterpriseDetailInfo mgEnterpriseDetailInfo = new MgEnterpriseDetailInfo();
        BeanUtils.copyProperties(mgEnterpriseDetailInfoVo, mgEnterpriseDetailInfo);
        try {
            mgEnterpriseDetailInfoGeneratorMapper.updateByExample(mgEnterpriseDetailInfo,
                    new MgEnterpriseDetailInfoExample()
                            .or()
                            .andEnterpriseIdEqualTo(enterpriseId)
                            .example());
            return true;
        } catch (Exception e) {
            log.error("修改企业详情信息时异常:{}", e.getMessage());
            return false;
        }
    }
}
