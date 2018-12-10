package com.formain.server.service.impl;


import com.formain.server.common.ProductStatus;
import com.formain.server.common.ResultEnum;
import com.formain.server.dataobject.ProductInfo;
import com.formain.server.dto.ProductDto;
import com.formain.server.exception.ResultException;
import com.formain.server.repository.ProductInfoRepository;
import com.formain.server.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * 项目名称：product
 * 包： com.formain.product.service.impl
 * 类名称：ProductServiceImpl.java
 * 类描述：
 * 创建人：wufuming
 * 创建时间：2018年11月18日
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUp() {
        return productInfoRepository.findByProductStatus(ProductStatus.UP.getCode());
    }

    @Override
    public List<ProductInfo> listForOrder(List<String> productIds) {
        return productInfoRepository.findByProductIdIn(productIds);
    }

    @Override
    @Transactional
    public void decreaseStock(List<ProductDto> productDtos) {
        for (ProductDto productDto : productDtos) {
            String productId = productDto.getProductId();
            Optional<ProductInfo> productInfoOptional = productInfoRepository.findById(productId);
            boolean present = productInfoOptional.isPresent();
            if (!present) {
                throw new ResultException(ResultEnum.PRODUCT_NO_PRESENT);
            }
            ProductInfo productInfo = productInfoOptional.get();
            int remain=productInfo.getProductStock()- productDto.getProductQuantity();
            if (remain<0) {
                throw new ResultException(ResultEnum.STOCK_ON_ERROR);
            }
            productInfo.setProductStock(remain);
            productInfoRepository.save(productInfo);
        }
    }
}