package com.sakura.project.web.controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakura.project.common.dto.MgUserInfoDto;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgUserInfo;
import com.sakura.project.service.MgUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/28 16:54
 */
@RestController
@CrossOrigin
@RequestMapping("/mg/user")
@Api(tags = "用户管理控制器")
public class MgUserController {

    @Autowired
    private MgUserService mgUserService;

    @PostMapping
    @ApiOperation("新增用户")
    public JsonResult<Boolean> add(@RequestBody MgUserInfo mgUserInfo) {
        return mgUserService.add(mgUserInfo);
    }

    @GetMapping
    @ApiOperation("分页列表")
    public PageResult<MgUserInfoDto> list(Pageable pageable, HttpServletRequest request) {
        return mgUserService.list(pageable, new PageData(request));
    }

    @GetMapping("/{userId}")
    @ApiOperation("获取单个用户信息")
    public JsonResult<MgUserInfoDto> get(@PathVariable Integer userId) {
        return mgUserService.get(userId);
    }

    @PutMapping("/{userId}")
    @ApiOperation("修改用户")
    public JsonResult<Boolean> update(@PathVariable Integer userId, @RequestBody MgUserInfo mgUserInfo) {
        mgUserInfo.setId(userId);
        return mgUserService.update(mgUserInfo);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除用户")
    public JsonResult<Boolean> del(@PathVariable Integer id) {
        return mgUserService.del(id);
    }

    @PutMapping
    @ApiOperation("修改密码")
    public JsonResult<Boolean> updatePwd(@RequestBody PageData pageData) {
        return mgUserService.updatePwd(pageData);
    }

    @GetMapping("/role")
    @ApiOperation("角色列表下拉框")
    public JsonResult<List<String>> role() {
        return mgUserService.role();
    }

}
