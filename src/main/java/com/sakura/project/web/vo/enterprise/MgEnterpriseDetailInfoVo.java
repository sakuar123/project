package com.sakura.project.web.vo.enterprise;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/29 17:36
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MgEnterpriseDetailInfoVo {

    @ApiModelProperty(value = "企业名称")
    private String enterpriseName;

    @ApiModelProperty(value = "企业法人")
    private String enterpriseLegalPerson;

    @ApiModelProperty(value = "企业负责人")
    private String enterprisePrincipal;

    @ApiModelProperty(value = "企业电话")
    private String enterprisePhone;

    @ApiModelProperty(value = "企业社会信用代码")
    private String enterpriseTaxpayerId;

    @ApiModelProperty(value = "企业性质")
    private String enterpriseNature;

    @ApiModelProperty(value = "注册日期")
    private String enterpriseRegisterDate;

    @ApiModelProperty(value = "股权结构")
    private String enterpriseOwnershipStructure;

    @ApiModelProperty(value = "经营范围")
    private String enterpriseBusinessScope;

    @ApiModelProperty(value = "开户银行")
    private String enterpriseBankAccount;

    @ApiModelProperty(value = "银行资料")
    private String enterpriseAccount;

    @ApiModelProperty(value = "企业简介")
    private String enterpriseProfile;

    @ApiModelProperty(value = "企业经营许可证图片")
    private String enterpriseUrl;

}
