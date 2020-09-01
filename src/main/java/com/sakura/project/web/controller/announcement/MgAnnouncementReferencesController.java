package com.sakura.project.web.controller.announcement;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakura.project.common.dto.MgAnnouncementReferencesDto;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgAnnouncementReferences;
import com.sakura.project.service.MgAnnouncementReferencesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/9/1 15:19
 */
@RestController
@Api(tags = "公告资料管理控制器")
@RequestMapping("/mg/announcement/references")
public class MgAnnouncementReferencesController {

    @Autowired
    private MgAnnouncementReferencesService mgAnnouncementReferencesService;

    @GetMapping
    @ApiOperation("分页列表")
    public PageResult<MgAnnouncementReferencesDto> list(Pageable pageable, HttpServletRequest request) {
        return mgAnnouncementReferencesService.list(pageable, new PageData(request));
    }

    @PostMapping
    @ApiOperation("新上传资料")
    public JsonResult<Boolean> add(@RequestBody MgAnnouncementReferences mgAnnouncementReferences,
            HttpServletRequest request) {
        return mgAnnouncementReferencesService
                .add(new PageData(request).getIntegerVal("userId"), mgAnnouncementReferences);
    }

    @DeleteMapping("/{id}")
    public JsonResult<Boolean> del(@PathVariable Integer id) {
        return mgAnnouncementReferencesService.del(id);
    }

}
