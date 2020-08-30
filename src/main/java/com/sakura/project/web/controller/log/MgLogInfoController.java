package com.sakura.project.web.controller.log;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakura.project.common.dto.MgLogInfoDto;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.service.MgLogInfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 15:48
 */
@RestController
@RequestMapping("/mg/log")
@Api(tags = "系统日志控制器")
public class MgLogInfoController {

    @Autowired
    private MgLogInfoService mgLogInfoService;

    @GetMapping
    @ApiOperation("分页查询")
    public PageResult<MgLogInfoDto> list(Pageable pageable, HttpServletRequest request) {
        return mgLogInfoService.list(pageable, new PageData(request));
    }

}
