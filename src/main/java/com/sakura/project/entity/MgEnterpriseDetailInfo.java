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
* Created by Mybatis Generator on 2020/08/29
* @author 李七夜 
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="企业详情信息表")
@Table(name = "mg_enterprise_detail_info")
public class MgEnterpriseDetailInfo implements Serializable {
    @Id
    @ApiModelProperty(value="主键id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(value="企业id")
    private Integer enterpriseId;

    @ApiModelProperty(value="注册日期")
    private String enterpriseRegisterDate;

    @ApiModelProperty(value="股权结构")
    private String enterpriseOwnershipStructure;

    @ApiModelProperty(value="经营范围")
    private String enterpriseBusinessScope;

    @ApiModelProperty(value="开户银行")
    private String enterpriseBankAccount;

    @ApiModelProperty(value="银行资料")
    private String enterpriseAccount;

    @ApiModelProperty(value="企业简介")
    private String enterpriseProfile;

    @ApiModelProperty(value="企业经营许可证图片")
    private String enterpriseUrl;

    @ApiModelProperty(value="创建时间")
    private Date createDate;

    @ApiModelProperty(value="更新时间")
    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public enum Column {
        id("id", "id", "INTEGER", false),
        enterpriseId("enterprise_id", "enterpriseId", "INTEGER", false),
        enterpriseRegisterDate("enterprise_register_date", "enterpriseRegisterDate", "VARCHAR", false),
        enterpriseOwnershipStructure("enterprise_ownership_structure", "enterpriseOwnershipStructure", "VARCHAR", false),
        enterpriseBusinessScope("enterprise_business_scope", "enterpriseBusinessScope", "VARCHAR", false),
        enterpriseBankAccount("enterprise_bank_account", "enterpriseBankAccount", "VARCHAR", false),
        enterpriseAccount("enterprise_account", "enterpriseAccount", "VARCHAR", false),
        enterpriseProfile("enterprise_profile", "enterpriseProfile", "VARCHAR", false),
        enterpriseUrl("enterprise_url", "enterpriseUrl", "VARCHAR", false),
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

        public static Column[] excludes(Column ... excludes) {
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
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}