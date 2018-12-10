package com.formain.server.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 项目名称：product
 * 包： com.formain.product.vo
 * 类名称：ProductVo.java
 * 类描述：商品vo
 * 创建人：wufuming
 * 创建时间：2018年11月18日
 */
@Data
public class ProductVo {

    @JsonProperty("name")//返回给前端的字段
    private String categoryName;//以免含义不清

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVo> productInfoList;
}