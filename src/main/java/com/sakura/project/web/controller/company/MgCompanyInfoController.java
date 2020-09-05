package com.sakura.project.web.controller.company;

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
import com.sakura.project.entity.MgCompanyInfo;
import com.sakura.project.service.MgCompanyInfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 16:30
 */
@RestController
@RequestMapping("/mg/company")
@Api(tags = "公司管理控制器")
public class MgCompanyInfoController {

    @Autowired
    private MgCompanyInfoService mgCompanyInfoService;

    @GetMapping
    @ApiOperation("分页列表")
    public PageResult<MgCompanyInfo> list(Pageable pageable, HttpServletRequest request) {
        return mgCompanyInfoService.list(pageable, new PageData(request));
    }

    @PostMapping
    @ApiOperation("新增公司")
    public JsonResult<Boolean> add(@RequestBody MgCompanyInfo mgCompanyInfo) {
        return mgCompanyInfoService.add(mgCompanyInfo);
    }

    @PutMapping("/{id}")
    @ApiOperation("修改公司")
    public JsonResult<Boolean> update(@PathVariable Integer id, @RequestBody MgCompanyInfo mgCompanyInfo) {
        mgCompanyInfo.setId(id);
        return mgCompanyInfoService.update(mgCompanyInfo);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除公司")
    public JsonResult<Boolean> del(@PathVariable Integer id) {
        return mgCompanyInfoService.del(id);
    }

    @GetMapping("/option")
    @ApiOperation("公司下拉列表框")
    public JsonResult<List<PageData>> option() {
        return mgCompanyInfoService.company();
    }
}
