package com.formain.server.controller;

import com.formain.server.common.ResultUtil;
import com.formain.server.dataobject.ProductCategory;
import com.formain.server.dataobject.ProductInfo;
import com.formain.server.dto.ProductDto;
import com.formain.server.service.CategoryService;
import com.formain.server.service.ProductService;
import com.formain.server.vo.ProductInfoVo;
import com.formain.server.vo.ProductVo;
import com.formain.server.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 项目名称：product
 * 包： com.formain.product.controller
 * 类名称：ProductController.java
 * 类描述：商品控制器
 * 创建人：wufuming
 * 创建时间：2018年11月18日
 */
@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVo<List<ProductVo>> list() {

        List<ProductInfo> productInfoList = productService.findUp();
        List<Integer> productTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(productTypeList);

        List<ProductVo> productVoList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVo productVo = new ProductVo();
            productVo.setCategoryName(productCategory.getCategoryName());
            productVo.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVo> productInfoVos = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productCategory.getCategoryType().equals(productInfo.getCategoryType())) {
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(productInfo, productInfoVo);
                    productInfoVos.add(productInfoVo);
                }
            }
            productVo.setProductInfoList(productInfoVos);
            productVoList.add(productVo);
        }
        return ResultUtil.success(productVoList);
    }
    @PostMapping("/listForOrder")
    public List<ProductInfo> listForOrder(@RequestBody List<String> productIds){
        return productService.listForOrder(productIds);
    }
    @PostMapping("/decreaseStock")
    public void decreaseStock(@RequestBody List<ProductDto> productDtos) {
        log.info("productDtos-->"+productDtos);
        productService.decreaseStock(productDtos);
    }

}