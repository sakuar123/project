package com.sakura.project.common.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/9/5 14:49
 */
@Getter
@AllArgsConstructor
public enum EnumProjectStatus {
    待审核(1, "待审核"),
    已通过(2, "已通过"),
    已驳回(-1, "已驳回"),
    ;
    private Integer code;
    private String val;

    public static Map<Integer, String> getMap() {
//        DateUtils.toLocalDateTime(new Date()).getYear();
//        Set<Integer> set = Arrays.stream(values()).map(EnumProjectStatus::getCode).collect(Collectors.toSet());
        return Arrays.stream(values())
                .collect(Collectors.toMap(EnumProjectStatus::getCode, EnumProjectStatus::getVal, (s1, s2) -> s1));
    }
}
