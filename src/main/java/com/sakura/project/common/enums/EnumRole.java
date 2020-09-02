package com.sakura.project.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/9/1 21:28
 */
@Getter
@AllArgsConstructor
public enum EnumRole {
    ADMIN(1, "MG_ADMIN", "超级管理员"),
    TBR(1, "MG_TBR", "填报人"),
    SHR(1, "MG_SHR", "审核人"),
    ;
    private Integer code;

    private String value;

    private String desc;
}
