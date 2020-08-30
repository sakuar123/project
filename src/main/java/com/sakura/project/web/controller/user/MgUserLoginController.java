package com.sakura.project.web.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.service.MgUserLoginService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 14:51
 */
@RestController
@Api(tags = "用户登录接口")
@RequestMapping("/mg/login")
public class MgUserLoginController {

    @Autowired
    private MgUserLoginService mgUserLoginService;

    @PostMapping("/captcha")
    @ApiOperation("发送验证码")
    public JsonResult<PageData> sendCaptcha(HttpServletRequest request) {
        return mgUserLoginService.sendCaptcha(new PageData(request));
    }

    @PostMapping()
    @ApiOperation("登录")
    public JsonResult<PageData> login(HttpServletRequest request) {
        return mgUserLoginService.login(new PageData(request));
    }
}
