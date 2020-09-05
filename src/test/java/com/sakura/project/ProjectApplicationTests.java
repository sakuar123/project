package com.sakura.project;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alibaba.fastjson.JSON;
import com.sakura.project.common.util.Assert;
import com.sakura.project.common.util.CommonsUtil;
import com.sakura.project.common.util.DateUtils;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.MD5Util;
import com.sakura.project.common.util.ObjectTools;
import com.sakura.project.common.util.PageData;
import com.sakura.project.entity.MgProjectFundsInfo;
import com.sakura.project.entity.MgUserInfo;
import com.sakura.project.mapper.generator.MgUserInfoGeneratorMapper;
import com.sakura.project.service.MgProjectFundsInfoService;

@SpringBootTest
class ProjectApplicationTests {

    @Autowired
    private MgUserInfoGeneratorMapper mgUserInfoGeneratorMapper;
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    private MgProjectFundsInfoService mgProjectFundsInfoService;

    public static void main(String[] args) {
//        List<String> ids = Lists.newArrayList();
//        ids.add("1");
//        ids.add("2");
//        ids.add("3");
//        List<String> newList = ids.stream().filter(s -> !s.equals("1")).collect(Collectors.toList());
//        System.out.println(JSON.toJSON(newList));
        String text = "12312";
        System.out.println(StringUtils.isNotBlank(text));
    }

    @Test
    void t1() {
        String salt = CommonsUtil.getRandomString(6);
        String password = MD5Util.getMd5("123456", salt);
        MgUserInfo mgUserInfo = MgUserInfo
                .builder()
                .companyId(1)
                .roleId(1)
                .userIdCard("34262619811231733X")
                .userName("张三")
                .userPassword(password)
                .userPasswordSalt(salt)
                .userEmail("kevintian126@126.com")
                .userPhone("13067909999")
                .build();
        //从用户输入的身份证号中获取出生日期和性别
        PageData pageData = CommonsUtil.getIdentityInfoByIdCard(mgUserInfo.getUserIdCard());
        Assert.isTrue(ObjectTools.isNotBlank(pageData), "身份证输入有误,请输入身份证!");
        mgUserInfo.setUserBirthday(DateUtils.parseDate(pageData.getStringVal("birthday")));
        mgUserInfo.setUserGender("M".equals(pageData.getString("sex")) ? 1 : 2);
        mgUserInfoGeneratorMapper.insertSelective(mgUserInfo);
    }

    @Test
    void t2() {
        List<PageData> list = sqlSessionTemplate.<PageData>selectList("TestMapper.list", null);
        System.out.println(JSON.toJSON(list));
    }

    @Test
    void t3() {
        MgProjectFundsInfo mgProjectFundsInfo = MgProjectFundsInfo
                .builder()
                .projectAddress("深圳市高新科技园南区高新南一道飞亚达高科技大厦3-10层")
                .projectAnnouncementId(1)
                .projectBankInvestment(new BigDecimal("0.00"))
                .projectBody("腾讯地图开放平台为各类应用厂商和开发者提供基于腾讯地图的地理位置服务和解决方案")
                .projectBranch(1)
                .projectCenterInvestment(new BigDecimal("400000"))
                .projectConstructionNature("腾讯地图开放平台为各类应用厂商和开发者提供基于腾讯地图的地理位置服务和解决方案")
                .projectContent("腾讯地图开放平台为各类应用厂商和开发者提供基于腾讯地图的地理位置服务和解决方案")
                .projectCreateUser(1)
                .projectDeclareTime(new Date())
                .projectDepartment(1)
                .projectEndTime(org.apache.commons.lang3.time.DateUtils.addHours(new Date(), 6))
                .projectEnterpriseInvestment(null)
                .projectFundsQuota(new BigDecimal("1532000"))
                .projectIsTopic(1)
                .projectLeave(2)
                .projectName("百度视频 - 中国领先的在线视频媒体平台,海量高清视频在线观看")
                .projectProvinceInvestment(new BigDecimal("200000"))
                .projectStartTime(new Date())
                .projectSustain(1)
                .build();
        JsonResult<Boolean> jsonResult = mgProjectFundsInfoService.add(mgProjectFundsInfo);
        System.out.println(jsonResult.getData());
    }
}
