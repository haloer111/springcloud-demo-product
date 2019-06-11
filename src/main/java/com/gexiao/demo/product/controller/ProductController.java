package com.gexiao.demo.product.controller;

import com.gexiao.demo.product.entity.ProductCategory;
import com.gexiao.demo.product.entity.ProductInfo;
import com.gexiao.demo.product.service.CategoryService;
import com.gexiao.demo.product.service.ProductService;
import com.gexiao.demo.product.utils.ResultVoUtil;
import com.gexiao.demo.product.vo.ProductInfoVo;
import com.gexiao.demo.product.vo.ProductVo;
import com.gexiao.demo.product.vo.ResultVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: gexiao
 * @Date: 2019/6/11 17:30
 * @Description:
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("list")
    public ResultVo<ProductVo> list() {
        //查询所有在架的商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        // 获取类目type列表
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType).collect(Collectors.toList());

        //从数据库查询类目
        List<ProductCategory> findCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        //构造对象
        List<ProductVo> productVoList = new ArrayList<>();

        findCategoryList.forEach(e -> {
            ProductVo vo = new ProductVo();
            BeanUtils.copyProperties(e, vo);

            List<ProductInfoVo> infoVoList = new ArrayList<>();
            productInfoList.forEach(info -> {
                if (info.getCategoryType().equals(e.getCategoryType())) {
                    ProductInfoVo infoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(info, infoVo);
                    infoVoList.add(infoVo);
                }
            });
            vo.setProductInfoVoList(infoVoList);
            productVoList.add(vo);
        });

        return ResultVoUtil.success(productVoList);
    }
}
