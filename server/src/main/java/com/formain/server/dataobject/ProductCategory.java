package com.formain.server.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 项目名称：product
 * 包： com.formain.product.dataobject
 * 类名称：ProductCategory.java
 * 类描述：商品类目实体类
 * 创建人：wufuming
 * 创建时间：2018年11月18日
 */
@Entity
@Data
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}