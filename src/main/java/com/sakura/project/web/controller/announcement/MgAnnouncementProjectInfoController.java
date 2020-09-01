package com.sakura.project.web.controller.announcement;

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

import com.sakura.project.common.dto.MgAnnouncementProjectInfoDto;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgAnnouncementProjectInfo;
import com.sakura.project.service.MgAnnouncementProjectInfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/31 15:19
 */
@RestController
@Api(tags = "项目公告管理控制器")
@RequestMapping("/mg/announcement/project")
public class MgAnnouncementProjectInfoController {

    @Autowired
    private MgAnnouncementProjectInfoService mgAnnouncementProjectInfoService;

    @GetMapping("/{id}")
    @ApiOperation("获取项目公告详情信息")
    public JsonResult<MgAnnouncementProjectInfoDto> get(@PathVariable Integer id) {
        return mgAnnouncementProjectInfoService.get(id);
    }

    @GetMapping
    @ApiOperation("分页列表")
    public PageResult<MgAnnouncementProjectInfoDto> list(Pageable pageable, HttpServletRequest request) {
        return mgAnnouncementProjectInfoService.list(pageable, new PageData(request));
    }

    @PostMapping
    @ApiOperation("发布项目公告")
    public JsonResult<Boolean> add(@RequestBody MgAnnouncementProjectInfo mgAnnouncementProjectInfo,
            HttpServletRequest request) {
        mgAnnouncementProjectInfo.setCreateUserId(new PageData(request).getIntegerVal("userId"));
        return mgAnnouncementProjectInfoService.add(mgAnnouncementProjectInfo);
    }

    @PutMapping("/{id}")
    @ApiOperation("修改项目公告")
    public JsonResult<Boolean> edit(@RequestBody MgAnnouncementProjectInfo mgAnnouncementProjectInfo,
            @PathVariable Integer id) {
        mgAnnouncementProjectInfo.setId(id);
        return mgAnnouncementProjectInfoService.edit(mgAnnouncementProjectInfo);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除项目公告")
    public JsonResult<Boolean> del(@PathVariable Integer id) {
        return mgAnnouncementProjectInfoService.del(id);
    }
}
