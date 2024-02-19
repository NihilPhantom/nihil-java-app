package com.nihil.common.response;

import lombok.Data;
import com.nihil.common.response.enums.ErrorDataEnums;


@Data
public class Result<T> {
    private String msg;
    private int code;
    private T data;

    public Result() {}
    public Result(int code) {
        this.code = code;
    }

    public Result(String msg) {
        this.msg = msg;
    }

    public Result(ErrorDataEnums enums) {
        this.code = enums.getCode();
        this.msg = enums.getMsg();
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(T data, ErrorDataEnums enums) {
        this.data = data;
        this.code = enums.getCode();
        this.msg = enums.getMsg();
    }

    public Result(String msg, ErrorDataEnums enums) {
        this.msg = msg;
        this.code = enums.getCode();
    }

    public Result(String msg, int code, T data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public static <T> Result<T> success(T date) {
        return new Result<>(date, ErrorDataEnums.SUCCESS);
    }

    public static <T> Result<T> success() {
        return new Result<>(ErrorDataEnums.SUCCESS.getMsg(), ErrorDataEnums.SUCCESS);
    }

    public static <T> Result<T> failed() {
        return new Result<>(ErrorDataEnums.FAILED.getMsg(), ErrorDataEnums.FAILED);
    }

    public static <T> Result<T> failed(int code) {
        return new Result<>(code);
    }

    public static <T> Result<T> failed(String msg) {
        return new Result<>(msg, ErrorDataEnums.FAILED);
    }

    public static <T> Result<T> failed(String msg, int code) {
        return new Result<>(code, msg);
    }

    public static <T> Result<T> failed(String msg, int code, T data) {
        return new Result<>(msg, code, data);
    }

    public static <T> Result<T> failed(ErrorDataEnums enums) {
        return new Result<>(enums);
    }

    public static <T> Result<T> failed(ErrorDataEnums enums, T data) {
        return new Result<>(data, enums);
    }
}
