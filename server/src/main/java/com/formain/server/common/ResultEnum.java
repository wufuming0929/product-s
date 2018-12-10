package com.formain.server.common;

import lombok.Getter;

/**
 * 项目名称：product
 * 包： com.formain.product.common
 * 类名称：ResultEnum.java
 * 类描述：异常结果描述枚举
 * 创建人：wufuming
 * 创建时间：2018年11月21日
 */
@Getter
public enum ResultEnum {
    PRODUCT_NO_PRESENT(0,"商品已下架"),
    STOCK_ON_ERROR(1,"库存不足");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
