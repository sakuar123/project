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
 * Created by 李七夜 on 2020/8/30 15:49
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MgLogInfoDto {

    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "用户操作功能")
    private String userOperating;

    @ApiModelProperty(value = "描述")
    private String userDescription;

    @ApiModelProperty(value = "IP")
    private String userIp;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = DateUtils.SECOND_DATE_PATTERN)
    private Date createDate;

    @ApiModelProperty(value = "用户名")
    private String userName;


}
