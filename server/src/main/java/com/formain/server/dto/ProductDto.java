package com.formain.server.dto;

import lombok.Data;

/**
 * 项目名称：product
 * 包： com.formain.product.dto
 * 类名称：ProdcutDto.java
 * 类描述：产品数据传输对象
 * 创建人：wufuming
 * 创建时间：2018年11月21日
 */
@Data
public class ProductDto {
    private String productId;
    private Integer productQuantity;
}