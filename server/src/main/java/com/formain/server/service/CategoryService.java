package com.formain.server.service;

import com.formain.server.dataobject.ProductCategory;

import java.util.List;

/**
 * 项目名称：product
 * 包： com.formain.product.service
 * 类名称：CategoryService.java
 * 类描述：商品类目service
 * 创建人：wufuming
 * 创建时间：2018年11月18日
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType);
}
