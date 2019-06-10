package com.gexiao.demo.product.dao;

import com.gexiao.demo.product.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<ProductInfo,String > {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
