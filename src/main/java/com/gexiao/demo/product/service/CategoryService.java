package com.gexiao.demo.product.service;

import com.gexiao.demo.product.entity.ProductCategory;

import java.util.List;

/**
 * @Auther: gexiao
 * @Date: 2019/6/11 17:11
 * @Description:
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> types);
}
