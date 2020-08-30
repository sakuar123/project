package com.sakura.project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Mybatis Generator on 2020/08/28
 * @author 李七夜
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "用户表")
@Table(name = "mg_user_info")
public class MgUserInfo implements Serializable {

    @Id
    @ApiModelProperty(value = "主键id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "手机号")
    private String userPhone;

    @ApiModelProperty(value = "出生日期")
    private Date userBirthday;

    @ApiModelProperty(value = "性别")
    private Integer userGender;

    @ApiModelProperty(value = "用户邮箱")
    private String userEmail;

    @ApiModelProperty(value = "用户身份证号")
    private String userIdCard;

    @ApiModelProperty(value = "密码")
    private String userPassword;

    @ApiModelProperty(value = "密码盐")
    private String userPasswordSalt;

    @ApiModelProperty(value = "所属公司")
    private Integer companyId;

    @ApiModelProperty(value = "角色")
    private Integer roleId;

    @ApiModelProperty(value = "是否启用,-1为禁用,1:为启用")
    private Integer userState;

    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    @ApiModelProperty(value = "更新时间")
    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public enum Column {
        id("id", "id", "INTEGER", false),
        userName("user_name", "userName", "VARCHAR", false),
        userPhone("user_phone", "userPhone", "VARCHAR", false),
        userBirthday("user_birthday", "userBirthday", "TIMESTAMP", false),
        userGender("user_gender", "userGender", "INTEGER", false),
        userEmail("user_email", "userEmail", "VARCHAR", false),
        userIdCard("user_id_card", "userIdCard", "VARCHAR", false),
        userPassword("user_password", "userPassword", "VARCHAR", false),
        userPasswordSalt("user_password_salt", "userPasswordSalt", "VARCHAR", false),
        companyId("company_id", "companyId", "INTEGER", false),
        roleId("role_id", "roleId", "INTEGER", false),
        userState("user_state", "userState", "INTEGER", false),
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