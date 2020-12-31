package com.sakura.project.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

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
 * Created by Mybatis Generator on 2020/09/05
 * @author 李七夜
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "荣誉类项目填报表")
@Table(name = "mg_project_honor_info")
public class MgProjectHonorInfo implements Serializable {

    @Id
    @ApiModelProperty(value = "主键id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "项目公告")
    private Integer projectAnnouncementId;

    @ApiModelProperty(value = "荣誉名称")
    private String projectHonorName;

    @ApiModelProperty(value = "项目主体")
    private String projectBody;

    @ApiModelProperty(value = "项目申报时间")
    private Date projectDeclareTime;

    @ApiModelProperty(value = "项目等级")
    private Integer projectLeave;

    @ApiModelProperty(value = "项目主管部门")
    private Integer projectBranch;

    @ApiModelProperty(value = "主管科室")
    private Integer projectDepartment;

    @ApiModelProperty(value = "备注")
    private String projectDescription;

    @ApiModelProperty(value = "项目创建者")
    private Integer projectCreateUser;

    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    @ApiModelProperty(value = "更新时间")
    private Date updateDate;

    @ApiModelProperty(value = "项目申报条件")
    private String projectDeclareCondition;

    private static final long serialVersionUID = 1L;

    public enum Column {
        id("id", "id", "INTEGER", false),
        projectName("project_name", "projectName", "VARCHAR", false),
        projectAnnouncementId("project_announcement_id", "projectAnnouncementId", "INTEGER", false),
        projectHonorName("project_honor_name", "projectHonorName", "VARCHAR", false),
        projectBody("project_body", "projectBody", "VARCHAR", false),
        projectDeclareTime("project_declare_time", "projectDeclareTime", "TIMESTAMP", false),
        projectLeave("project_leave", "projectLeave", "INTEGER", false),
        projectBranch("project_branch", "projectBranch", "INTEGER", false),
        projectDepartment("project_department", "projectDepartment", "INTEGER", false),
        projectDescription("project_description", "projectDescription", "VARCHAR", false),
        projectCreateUser("project_create_user", "projectCreateUser", "INTEGER", false),
        createDate("create_date", "createDate", "TIMESTAMP", false),
        updateDate("update_date", "updateDate", "TIMESTAMP", false),
        projectDeclareCondition("project_declare_condition", "projectDeclareCondition", "LONGVARCHAR", false);

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