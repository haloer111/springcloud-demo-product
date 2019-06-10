package com.gexiao.demo.product.dao;

import com.gexiao.demo.product.SpringcloudProductApplicationTests;
import com.gexiao.demo.product.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

public class CategoryDaoTest  extends SpringcloudProductApplicationTests {

    @Autowired
    private CategoryDao categoryDao;

    @Test
    public void findByProductStatus()  {
        List<ProductCategory> list = categoryDao.findByCategoryTypeIn(Arrays.asList(11,22));
        Assert.assertTrue(list.size()>0);
    }

}