package com.gexiao.demo.product.service.impl;

import com.gexiao.demo.product.SpringcloudProductApplicationTests;
import com.gexiao.demo.product.entity.ProductCategory;
import com.gexiao.demo.product.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: gexiao
 * @Date: 2019/6/11 17:22
 * @Description:
 */
public class CategoryServiceImplTest extends SpringcloudProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11, 22));
        Assert.assertTrue(list.size()>0);
    }
}