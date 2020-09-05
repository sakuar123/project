package com.sakura.project.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Mybatis Generator on 2020/09/02
 * @author 李七夜
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "资金项目填报表")
@Table(name = "mg_project_funds_info")
public class MgProjectFundsInfo implements Serializable {

    @Id
    @ApiModelProperty(value = "主键id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(value = "项目公告")
    private Integer projectAnnouncementId;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "项目申报时间")
    private Date projectDeclareTime;

    @ApiModelProperty(value = "项目主体")
    private String projectBody;

    @ApiModelProperty(value = "项目状态")
    private Integer projectStatus;

    @ApiModelProperty(value = "项目建设性质")
    private String projectConstructionNature;

    @ApiModelProperty(value = "主要项目内容")
    private String projectContent;

    @ApiModelProperty(value = "项目开工时间")
    private Date projectStartTime;

    @ApiModelProperty(value = "项目结束时间")
    private Date projectEndTime;

    @ApiModelProperty(value = "项目建设地点")
    private String projectAddress;

    @ApiModelProperty(value = "项目资金额度")
    private BigDecimal projectFundsQuota;

    @ApiModelProperty(value = "中央预算投资")
    private BigDecimal projectCenterInvestment;

    @ApiModelProperty(value = "地方预算投资")
    private BigDecimal projectProvinceInvestment;

    @ApiModelProperty(value = "银行预算投资")
    private BigDecimal projectBankInvestment;

    @ApiModelProperty(value = "企业预算投资")
    private BigDecimal projectEnterpriseInvestment;

    @ApiModelProperty(value = "项目主管部门")
    private Integer projectBranch;

    @ApiModelProperty(value = "项目等级")
    private Integer projectLeave;

    @ApiModelProperty(value = "主管科室")
    private Integer projectDepartment;

    @ApiModelProperty(value = "项目是否立项")
    private Integer projectIsTopic;

    @ApiModelProperty(value = "项目支付支持方式")
    private Integer projectSustain;

    @ApiModelProperty(value = "项目创建者")
    private Integer projectCreateUser;

    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    @ApiModelProperty(value = "更新时间")
    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public enum Column {
        id("id", "id", "INTEGER", false),
        projectAnnouncementId("project_announcement_id", "projectAnnouncementId", "INTEGER", false),
        projectName("project_name", "projectName", "VARCHAR", false),
        projectDeclareTime("project_declare_time", "projectDeclareTime", "TIMESTAMP", false),
        projectBody("project_body", "projectBody", "VARCHAR", false),
        projectStatus("project_status", "projectStatus", "INTEGER", false),
        projectConstructionNature("project_construction_nature", "projectConstructionNature", "VARCHAR", false),
        projectContent("project_content", "projectContent", "VARCHAR", false),
        projectStartTime("project_start_time", "projectStartTime", "TIMESTAMP", false),
        projectEndTime("project_end_time", "projectEndTime", "TIMESTAMP", false),
        projectAddress("project_address", "projectAddress", "VARCHAR", false),
        projectFundsQuota("project_funds_quota", "projectFundsQuota", "DECIMAL", false),
        projectCenterInvestment("project_center_investment", "projectCenterInvestment", "DECIMAL", false),
        projectProvinceInvestment("project_province_investment", "projectProvinceInvestment", "DECIMAL", false),
        projectBankInvestment("project_bank_investment", "projectBankInvestment", "DECIMAL", false),
        projectEnterpriseInvestment("project_enterprise_investment", "projectEnterpriseInvestment", "DECIMAL", false),
        projectBranch("project_branch", "projectBranch", "INTEGER", false),
        projectLeave("project_leave", "projectLeave", "INTEGER", false),
        projectDepartment("project_department", "projectDepartment", "INTEGER", false),
        projectIsTopic("project_is_topic", "projectIsTopic", "INTEGER", false),
        projectSustain("project_sustain", "projectSustain", "INTEGER", false),
        projectCreateUser("project_create_user", "projectCreateUser", "INTEGER", false),
        createDate("create_date", "createDate", "TIMESTAMP", false),
        updateDate("update_date", "updateDate", "TIMESTAMP", false);

        private static final String BEGINNING_DELIMITER = "\"";

        private static final String ENDING_DELIMITER = "\"";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER)
                        .toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}