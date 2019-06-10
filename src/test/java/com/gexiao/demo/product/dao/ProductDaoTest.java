package com.gexiao.demo.product.dao;

import com.gexiao.demo.product.SpringcloudProductApplicationTests;
import com.gexiao.demo.product.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductDaoTest  extends SpringcloudProductApplicationTests {

    @Autowired
    private ProductDao productDao;

    @Test
    public void findByProductStatus()  {
        List<ProductInfo> list = productDao.findByProductStatus(0);
        Assert.assertTrue(list.size()>0);
    }

}