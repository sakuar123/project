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

import com.sakura.project.common.dto.MgAnnouncementReleaseDto;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgAnnouncementRelease;
import com.sakura.project.service.MgAnnouncementReleaseService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/31 16:06
 */
@RestController
@Api(tags = "通知公告管理控制器")
@RequestMapping("/mg/announcement/release")
public class MgAnnouncementReleaseController {

    @Autowired
    private MgAnnouncementReleaseService mgAnnouncementReleaseService;

    @GetMapping("/{id}")
    @ApiOperation("获取通知公告详情信息")
    public JsonResult<MgAnnouncementReleaseDto> get(@PathVariable Integer id) {
        return mgAnnouncementReleaseService.get(id);
    }

    @GetMapping
    @ApiOperation("分页列表")
    public PageResult<MgAnnouncementReleaseDto> list(Pageable pageable, HttpServletRequest request) {
        return mgAnnouncementReleaseService.list(pageable, new PageData(request));
    }

    @PostMapping
    @ApiOperation("发布通知公告")
    public JsonResult<Boolean> add(@RequestBody MgAnnouncementRelease mgAnnouncementRelease,
            HttpServletRequest request) {
        mgAnnouncementRelease.setCreateUserId(new PageData(request).getIntegerVal("userId"));
        return mgAnnouncementReleaseService.add(mgAnnouncementRelease);
    }

    @PutMapping("/{id}")
    @ApiOperation("修改通知公告")
    public JsonResult<Boolean> edit(@RequestBody MgAnnouncementRelease mgAnnouncementRelease,
            @PathVariable Integer id) {
        mgAnnouncementRelease.setId(id);
        return mgAnnouncementReleaseService.edit(mgAnnouncementRelease);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除通知公告")
    public JsonResult<Boolean> del(@PathVariable Integer id) {
        return mgAnnouncementReleaseService.del(id);
    }

}
