package com.gexiao.demo.product.service.impl;

import com.gexiao.demo.product.dao.CategoryDao;
import com.gexiao.demo.product.entity.ProductCategory;
import com.gexiao.demo.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: gexiao
 * @Date: 2019/6/11 17:21
 * @Description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;


    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> types) {
        List<ProductCategory> list = categoryDao.findByCategoryTypeIn(types);
        return list;
    }
}
