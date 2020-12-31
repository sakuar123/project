package com.sakura.project.web.controller.branch;

import java.util.List;

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
import com.sakura.project.entity.MgBranchInfo;
import com.sakura.project.service.MgBranchInfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 18:22
 */
@RestController
@Api(tags = "部门管理控制器")
@RequestMapping("/mg/branch")
public class MgBranchInfoController {

    @Autowired
    private MgBranchInfoService mgBranchInfoService;

    @GetMapping
    @ApiOperation("分页查询")
    public PageResult<MgBranchInfo> list(Pageable pageable, HttpServletRequest request) {
        return mgBranchInfoService.list(pageable, new PageData(request));
    }

    @PostMapping
    @ApiOperation("新增部门")
    public JsonResult<Boolean> add(@RequestBody MgBranchInfo mgBranchInfo) {
        return mgBranchInfoService.add(mgBranchInfo);
    }


    @PutMapping("/{id}")
    @ApiOperation("修改部门")
    public JsonResult<Boolean> edit(@PathVariable Integer id, @RequestBody MgBranchInfo mgBranchInfo) {
        mgBranchInfo.setId(id);
        return mgBranchInfoService.edit(mgBranchInfo);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除部门")
    public JsonResult<Boolean> del(@PathVariable Integer id) {
        return mgBranchInfoService.del(id);
    }

    @GetMapping("/option")
    @ApiOperation("主管部门下拉列表")
    public JsonResult<List<PageData>> option() {
        return mgBranchInfoService.option();
    }

}
