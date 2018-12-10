package com.formain.server.common;

import lombok.Getter;

/**
 * 项目名称：product
 * 包： com.formain.product.common
 * 类名称：ProductStatus.java
 * 类描述：商品状态枚举
 * 创建人：wufuming
 * 创建时间：2018年11月18日
 */
@Getter
public enum ProductStatus {
    UP(0,"商品上架"),DOWN(1,"商品下架");

    private Integer code;

    private String msg;

    ProductStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
