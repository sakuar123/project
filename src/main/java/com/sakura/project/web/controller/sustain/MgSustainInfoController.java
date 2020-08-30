package com.sakura.project.web.controller.sustain;

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
import com.sakura.project.entity.MgSustainInfo;
import com.sakura.project.service.MgSustainInfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 18:11
 */
@RestController
@Api(tags = "方式管理控制器")
@RequestMapping("/mg/sustain")
public class MgSustainInfoController {

    @Autowired
    private MgSustainInfoService mgSustainInfoService;

    @GetMapping
    @ApiOperation("分页查询")
    public PageResult<MgSustainInfo> list(Pageable pageable, HttpServletRequest request) {
        return mgSustainInfoService.list(pageable, new PageData(request));
    }

    @PostMapping
    @ApiOperation("新增方式")
    public JsonResult<Boolean> add(@RequestBody MgSustainInfo mgSustainInfo) {
        return mgSustainInfoService.add(mgSustainInfo);
    }


    @PutMapping("/{id}")
    @ApiOperation("修改方式")
    public JsonResult<Boolean> edit(@PathVariable Integer id, @RequestBody MgSustainInfo mgSustainInfo) {
        mgSustainInfo.setId(id);
        return mgSustainInfoService.edit(mgSustainInfo);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除方式")
    public JsonResult<Boolean> del(@PathVariable Integer id) {
        return mgSustainInfoService.del(id);
    }
}
