package com.sakura.project.web.controller.department;

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
import com.sakura.project.entity.MgDepartmentInfo;
import com.sakura.project.service.MgDepartmentInfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 17:24
 */
@RestController
@Api(tags = "科室管理控制器")
@RequestMapping("/mg/department")
public class MgDepartmentInfoController {

    @Autowired
    private MgDepartmentInfoService mgDepartmentInfoService;

    @GetMapping
    @ApiOperation("分页查询")
    public PageResult<MgDepartmentInfo> list(Pageable pageable, HttpServletRequest request) {
        return mgDepartmentInfoService.list(pageable, new PageData(request));
    }

    @PostMapping
    @ApiOperation("新增科室")
    public JsonResult<Boolean> add(@RequestBody MgDepartmentInfo mgDepartmentInfo) {
        return mgDepartmentInfoService.add(mgDepartmentInfo);
    }


    @PutMapping("/{id}")
    @ApiOperation("修改科室")
    public JsonResult<Boolean> edit(@PathVariable Integer id, @RequestBody MgDepartmentInfo mgDepartmentInfo) {
        mgDepartmentInfo.setId(id);
        return mgDepartmentInfoService.edit(mgDepartmentInfo);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除科室")
    public JsonResult<Boolean> del(@PathVariable Integer id) {
        return mgDepartmentInfoService.del(id);
    }

    @GetMapping("/option")
    @ApiOperation("科室下拉列表")
    public JsonResult<List<PageData>> option() {
        return mgDepartmentInfoService.option();
    }

}
