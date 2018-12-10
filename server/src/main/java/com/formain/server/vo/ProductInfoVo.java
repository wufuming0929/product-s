package com.formain.server.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 项目名称：product
 * 包： com.formain.product.vo
 * 类名称：ProductInfoVo.java
 * 类描述：商品信息vo
 * 创建人：wufuming
 * 创建时间：2018年11月18日
 */
@Data
public class ProductInfoVo {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}