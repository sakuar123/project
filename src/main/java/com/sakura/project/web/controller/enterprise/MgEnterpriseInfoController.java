package com.sakura.project.web.controller.enterprise;

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

import com.sakura.project.common.dto.MgEnterpriseInfoDto;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgEnterpriseInfo;
import com.sakura.project.service.MgEnterpriseInfoService;
import com.sakura.project.web.vo.enterprise.MgEnterpriseDetailInfoVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 11:04
 */
@RestController
@Api(tags = "企业管理控制器")
@RequestMapping("/mg/enterprise")
public class MgEnterpriseInfoController {

    @Autowired
    private MgEnterpriseInfoService mgEnterpriseInfoService;

    @GetMapping("/{id}")
    @ApiOperation("获取企业详情信息")
    public JsonResult<MgEnterpriseInfoDto> get(@PathVariable Integer id) {
        return mgEnterpriseInfoService.get(id);
    }


    @GetMapping
    @ApiOperation("分页列表")
    public PageResult<MgEnterpriseInfo> list(Pageable pageable, HttpServletRequest request) {
        return mgEnterpriseInfoService.list(pageable, new PageData(request));
    }

    @PostMapping
    @ApiOperation("新增企业信息")
    public JsonResult<Boolean> add(@RequestBody MgEnterpriseDetailInfoVo mgEnterpriseDetailInfoVo) {
        return mgEnterpriseInfoService.add(mgEnterpriseDetailInfoVo);
    }

    @PutMapping("/{id}")
    @ApiOperation("修改企业信息")
    public JsonResult<Boolean> update(@PathVariable Integer id,
            @RequestBody MgEnterpriseDetailInfoVo mgEnterpriseDetailInfoVo) {
        return mgEnterpriseInfoService.update(id, mgEnterpriseDetailInfoVo);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除企业信息")
    public JsonResult<Boolean> del(@PathVariable Integer id) {
        return mgEnterpriseInfoService.del(id);
    }

}
