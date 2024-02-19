package com.nihil.common.response.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public enum ErrorDataEnums {
    /**
     * 成功
     */
    SUCCESS("成功", 200),
    /**
     * 失败
     */
    FAILED("失败", 500),
    /**
     * 服务调用失败
     */
    SERVICE_FAILED("服务调用失败", 503),
    /**
     * 密码错误
     */
    WRONG_PASSWORD("密码错误", 401),
    /**
     * 无法访问
     */
    ACCESS_DENIED("无法访问", 403),
    /**
     * 通过网关访问
     */
    GATEWAY_TRANSBOUNDARY("通过网关访问", 403),
    /**
     * 登录已过期
     */
    USER_LOGIN_EXPIRED("登录已过期", 401),
    /**
     * 验证码已过期
     */
    AUTH_CODE_EXPIRED("验证码已过期", 401),
    /**
     * token不存在
     */
    TOKEN_IS_NULL("token不存在", 401),
    /**
     * 账户已锁定5分钟
     */
    USER_LOGIN_LOCKING("账户已锁定5分钟", 403),
    /**
     * 用户未登录
     */
    USER_NOT_LOGIN("用户未登录", 401),
    /**
     * 用户验证失败
     */
    USER_IS_FAIL("用户验证失败", 406),
    /**
     * 当前服务管理员已经存在，请更换角色
     */
    ADMIN_IS_USER("当前服务管理员已经存在，请更换角色", 401),
    /**
     * 用户不存在
     */
    USER_IS_NULL("用户不存在", 406),
    /**
     * 验证码错误
     */
    USER_CODE_FAIL("验证码错误", 406),
    /**
     * 用户角色为空
     */
    USER_ROLE_NULL("用户角色为空", 406),
    /**
     * 用户不在该项目内
     */
    USER_PROJECT_NULL("用户不在该项目内", 406),
    /**
     * 服务编号不匹配
     */
    PLATFORM_IS_FAIL("服务编号不匹配", 406),
    /**
     * 入参数据为空.
     */
    DATA_IS_NULL("入参数据为空", 406),

    /**
     * 回收数据赋值审核状态失败.
     */
    UPDATE_RECYCLE_FILED("回收数据赋值审核状态失败", 406),

    /**
     * 数据查询为空
     */
    DATA_NOT_FIND("查询为空", 404),

    /**
     * 入参数据为空.
     */
    PLUGIN_CANNOT_ACCESS("没有该插件的操作权限",1101);

    /**
     * 提示
     */
    private final String msg;
    /**
     * 错误编码
     */
    private final int code;

    ErrorDataEnums(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    @Override
    public String toString() {
        return this.msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private static final Map<String, Integer> DATE_ENUMS = new HashMap<>();

    static {
        Stream.of(ErrorDataEnums.values()).forEach(v -> DATE_ENUMS.put(v.msg, v.code));
    }

}