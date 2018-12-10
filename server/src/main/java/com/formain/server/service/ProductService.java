package com.formain.server.service;


import com.formain.server.dataobject.ProductInfo;
import com.formain.server.dto.ProductDto;

import java.util.List;

/**
 * 项目名称：product
 * 包： com.formain.product.service
 * 类名称：ProductService.java
 * 类描述：商品service
 * 创建人：wufuming
 * 创建时间：2018年11月18日
 */
public interface ProductService {

    List<ProductInfo> findUp();
    List<ProductInfo> listForOrder(List<String> productIds);
    void decreaseStock(List<ProductDto> productDtos);

}
