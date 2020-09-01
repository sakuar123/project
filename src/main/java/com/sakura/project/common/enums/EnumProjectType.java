package com.sakura.project.common.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/31 14:17
 */
@Getter
@AllArgsConstructor
public enum EnumProjectType {
    发改(1, "发改"),
    工信(2, "工信"),
    科技(3, "科技"),
    商务(4, "商务"),
    ;
    private Integer code;
    private String value;

    public static Map<Integer, String> getMap() {
        return Arrays.stream(values())
                .collect(Collectors.toMap(EnumProjectType::getCode, EnumProjectType::getValue, (s1, s2) -> s1));
    }
}
