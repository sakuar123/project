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
 * Created by 李七夜 on 2020/8/31 15:31
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MgAnnouncementReleaseDto {

    @ApiModelProperty(value = "序号")
    private Integer id;

    @ApiModelProperty(value = "通知标题")
    private String announcementTitle;

    @ApiModelProperty(value = "通知发布类型")
    private Integer announcementType;

    @ApiModelProperty(value = "通知发布类型")
    private String announcementTypeValue;

    @ApiModelProperty(value = "通知描述")
    private String announcemenDescription;

    @ApiModelProperty(value = "发布日期")
    @JsonFormat(pattern = DateUtils.DAY_DATE_PATTERN)
    private Date announcementTime;

    @ApiModelProperty(value = "资料附件url")
    private String announcemenAnnexUrl;

    @ApiModelProperty(value = "发布者")
    private String createUser;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = DateUtils.DAY_DATE_PATTERN)
    private Date createDate;

}
