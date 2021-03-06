package com.sakura.project.common.enums;

import java.util.Objects;

import com.sakura.project.common.enums.base.IMessageConstant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 */

@Slf4j
@Getter
@AllArgsConstructor
public enum EnumCommonsMessage implements IMessageConstant {

    FAILURE(-1, "操作失败"),
    IMPOSSIBLE_ERROR(-2, "不可能发生的异常"),
    REQUEST_PARAM_ERROR(-3, "请求参数异常"),
    ENUM_IS_ILLEGAL(-4, "枚举类型不合法"),

    BAD_REQUEST(400, "参数不合法"),
    UNAUTHORIZED(401, "未登录"),
    UNAUTHORIZEDROLE(402, "无权限,拒绝访问!"),
    FORBIDDEN(403, "没有权限"),
    NOT_FOUND(404, "资源不存在"),
    METHOD_NOT_ALLOWED(405, "不支持该请求方法"),
    METHOD_NOT_ALLOWED1(406, "登录失败"),
    UNSUPPORTED_MEDIA_TYPE(415, "不支持的数据格式"),
    //限流
    TOO_MANY_REQUESTS(429, "你当前请求次数太多,请稍候再试"),
    INTERNAL_SERVER_ERROR(500, "服务异常"),
    SERVICE_UNAVAILABLE(503, "服务正忙,请稍候再试"),
    ;

    private final int code;
    private final String message;

    public static EnumCommonsMessage valueOfCode(int code) {
        for (EnumCommonsMessage messageEnum : values()) {
            if (Objects.equals(messageEnum.getCode(), code)) {
                if (messageEnum == BAD_REQUEST) {
                    return REQUEST_PARAM_ERROR;
                }
                return messageEnum;
            }
        }
        log.warn("出现枚举未定义的状态码 code : {}", code);
        return INTERNAL_SERVER_ERROR;
    }
}
