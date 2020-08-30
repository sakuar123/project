package com.sakura.project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sakura.project.common.util.DateUtils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Mybatis Generator on 2020/08/30
 * @author 李七夜
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "支持方式信息表")
@Table(name = "mg_sustain_info")
public class MgSustainInfo implements Serializable {

    @Id
    @ApiModelProperty(value = "主键id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(value = "支持方式名称")
    private String sustainName;

    @ApiModelProperty(value = "科室备注")
    private String description;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = DateUtils.DAY_DATE_PATTERN)
    private Date createDate;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = DateUtils.DAY_DATE_PATTERN)
    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public enum Column {
        id("id", "id", "INTEGER", false),
        sustainName("sustain_name", "sustainName", "VARCHAR", false),
        description("description", "description", "VARCHAR", false),
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