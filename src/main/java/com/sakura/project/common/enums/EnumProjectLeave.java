package com.sakura.project.common.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/9/5 15:08
 */
@Getter
@AllArgsConstructor
public enum EnumProjectLeave {

    市级(1, "市级"),
    省级(1, "省级"),
    国级(1, "国级"),
    ;

    private Integer code;
    private String leave;

    public static Map<Integer, String> getMap() {
        return Arrays.stream(values())
                .collect(Collectors.toMap(EnumProjectLeave::getCode, EnumProjectLeave::getLeave, (s1, s2) -> s1));
    }

}
