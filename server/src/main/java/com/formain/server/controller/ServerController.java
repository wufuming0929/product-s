package com.formain.server.controller;

import com.formain.server.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：product
 * 包： com.formain.product.controller
 * 类名称：ServerController.java
 * 类描述：服务端测试代码
 * 创建人：wufuming
 * 创建时间：2018年11月18日
 */
@RestController
@RequestMapping("/test")
public class ServerController {

    @Autowired
    private ProductService productService;

    @GetMapping("/msg")
    public String msg(){
        return "this is product'msg";
    }


}