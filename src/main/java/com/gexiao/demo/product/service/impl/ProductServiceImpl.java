package com.gexiao.demo.product.service.impl;

import com.gexiao.demo.product.dao.ProductDao;
import com.gexiao.demo.product.entity.ProductInfo;
import com.gexiao.demo.product.enums.ProductStatusEnum;
import com.gexiao.demo.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: gexiao
 * @Date: 2019/6/11 17:12
 * @Description:
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao  productDao;

    @Override
    public List<ProductInfo> findUpAll() {
        List<ProductInfo> list = productDao.findByProductStatus(ProductStatusEnum.UP.getCode());
        return list;
    }
}
