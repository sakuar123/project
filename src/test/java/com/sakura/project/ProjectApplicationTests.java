package com.sakura.project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sakura.project.common.util.Assert;
import com.sakura.project.common.util.CommonsUtil;
import com.sakura.project.common.util.DateUtils;
import com.sakura.project.common.util.MD5Util;
import com.sakura.project.common.util.ObjectTools;
import com.sakura.project.common.util.PageData;
import com.sakura.project.entity.MgUserInfo;
import com.sakura.project.mapper.generator.MgUserInfoGeneratorMapper;

@SpringBootTest
class ProjectApplicationTests {

    @Autowired
    private MgUserInfoGeneratorMapper mgUserInfoGeneratorMapper;

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

}
