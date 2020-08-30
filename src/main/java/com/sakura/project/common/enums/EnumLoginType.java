package com.sakura.project.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 15:07
 */
@Getter
@AllArgsConstructor
public enum EnumLoginType {

    PWD(1, "PWD"),
    CAPTCHA(2, "CAPTCHA");
    private Integer code;
    private String loginType;
}
