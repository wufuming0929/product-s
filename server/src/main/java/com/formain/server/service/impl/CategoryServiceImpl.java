package com.formain.server.service.impl;

import com.formain.server.dataobject.ProductCategory;
import com.formain.server.repository.ProductCategoryRepository;
import com.formain.server.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目名称：product
 * 包： com.formain.product.service.impl
 * 类名称：CategoryServiceImpl.java
 * 类描述：
 * 创建人：wufuming
 * 创建时间：2018年11月18日
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType) {
        return productCategoryRepository.findByCategoryTypeIn(categoryType);
    }
}