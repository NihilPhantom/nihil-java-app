package com.nihil.common.exception;

import com.nihil.common.response.enums.ErrorDataEnums;

public class NihilException extends RuntimeException{

    private  String msg;
    private int code;

    public NihilException(ErrorDataEnums enums){
        this.msg = enums.getMsg();
        this.code = enums.getCode();
    }

    public NihilException(String errMsg){
        this.msg = errMsg;
        this.code = 500;
    }

    @Override
    public String getMessage(){
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
