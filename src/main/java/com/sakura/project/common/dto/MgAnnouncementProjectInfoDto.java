package com.sakura.project.common.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sakura.project.common.util.DateUtils;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/31 14:05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MgAnnouncementProjectInfoDto {

    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "项目类型")
    private Integer projectType;

    @ApiModelProperty(value = "项目类型")
    private String projectTypeValue;

    @ApiModelProperty(value = "发布日期")
    @JsonFormat(pattern = DateUtils.DAY_DATE_PATTERN)
    private Date projectTime;

    @ApiModelProperty(value = "发布者")
    private String createUser;

    @ApiModelProperty(value = "资料附件url")
    private String projectAnnexUrl;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = DateUtils.DAY_DATE_PATTERN)
    private Date createDate;

    @ApiModelProperty(value = "项目描述")
    private String projectDescription;

}
