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
 * Created by 李七夜 on 2020/9/1 15:02
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MgAnnouncementReferencesDto {

    @ApiModelProperty(value = "序号")
    private Integer id;

    @ApiModelProperty(value = "参考资料url")
    private String referencesUrl;

    @ApiModelProperty(value = "备注")
    private String referencesDescription;

    @ApiModelProperty(value = "上传公司名称")
    private String uploadCompanyName;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = DateUtils.DAY_DATE_PATTERN)
    private Date createDate;


}
