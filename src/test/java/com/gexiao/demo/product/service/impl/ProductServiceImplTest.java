package com.gexiao.demo.product.service.impl;

import com.gexiao.demo.product.SpringcloudProductApplicationTests;
import com.gexiao.demo.product.entity.ProductInfo;
import com.gexiao.demo.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: gexiao
 * @Date: 2019/6/11 17:15
 * @Description:
 */
public class ProductServiceImplTest extends SpringcloudProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size()>0);
    }
}