package com.sakura.project.web.controller.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgProjectFundsInfo;
import com.sakura.project.service.MgProjectFundsInfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/9/9 10:42
 */
@RestController
@Api(tags = "资金类项目管理控制器")
@RequestMapping("/mg/project/funds")
public class MgProjectFundsController {

    @Autowired
    private MgProjectFundsInfoService mgProjectFundsInfoService;

    @GetMapping("/{id}")
    @ApiOperation("获取项目详情")
    public JsonResult<PageData> get(@PathVariable Integer id) {
        return mgProjectFundsInfoService.get(id);
    }

    @GetMapping
    @ApiOperation("分页列表")
    public PageResult<PageData> list(Pageable pageable, HttpServletRequest request) {
        return mgProjectFundsInfoService.list(pageable, new PageData(request));
    }

    @PostMapping
    @ApiOperation("发布新的资金类项目")
    public JsonResult<Boolean> add(@RequestBody MgProjectFundsInfo mgProjectFundsInfo,
            HttpServletRequest request) {
        mgProjectFundsInfo.setProjectCreateUser(new PageData(request).getIntegerVal("userId"));
        return mgProjectFundsInfoService.add(mgProjectFundsInfo);
    }

    @PutMapping("/{id}")
    @ApiOperation("修改项目信息")
    public JsonResult<Boolean> edit(@RequestBody MgProjectFundsInfo mgProjectFundsInfo,
            @PathVariable Integer id) {
        mgProjectFundsInfo.setId(id);
        return mgProjectFundsInfoService.edit(mgProjectFundsInfo);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除项目")
    public JsonResult<Boolean> del(@PathVariable Integer id) {
        return mgProjectFundsInfoService.del(id);
    }

}
