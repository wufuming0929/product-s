package com.formain.server.service;

import com.formain.server.ProductApplicationTests;
import com.formain.server.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;
    @Test
    public void findUp() throws Exception {
        List<ProductInfo> list = productService.findUp();
        Assert.assertTrue(list.size()>0);
    }

}