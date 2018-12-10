package com.formain.server.exception;

import com.formain.server.common.ResultEnum;
import lombok.Getter;

/**
 * 项目名称：product
 * 包： com.formain.product.exception
 * 类名称：ResultException.java
 * 类描述：统一异常
 * 创建人：wufuming
 * 创建时间：2018年11月21日
 */
@Getter
public class ResultException extends RuntimeException{

    private Integer code;
    private String msg;

    public ResultException( Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public ResultException(ResultEnum resultEnum) {
        this(resultEnum.getCode(), resultEnum.getMsg());
    }
}