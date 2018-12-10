package com.formain.server.service;

import com.formain.server.ProductApplicationTests;
import com.formain.server.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

public class CategoryServiceTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;
    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11, 22));
        Assert.assertTrue(list.size()>0);
    }

}