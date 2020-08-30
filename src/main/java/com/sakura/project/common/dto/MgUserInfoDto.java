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
 * Created by 李七夜 on 2020/8/28 16:58
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MgUserInfoDto {

    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "手机号")
    private String userPhone;

    @ApiModelProperty(value = "用户邮箱")
    private String userEmail;

    @ApiModelProperty(value = "用户身份证号")
    private String userIdCard;

    @ApiModelProperty(value = "所属公司")
    private String companyName;

    @ApiModelProperty(value = "角色")
    private String roleName;

    @ApiModelProperty(value = "是否启用,-1为禁用,1:为启用")
    private String userState;

    @ApiModelProperty(value = "出生日期")
    @JsonFormat(pattern = DateUtils.DAY_DATE_PATTERN)
    private Date userBirthday;


}
