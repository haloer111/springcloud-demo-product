package com.gexiao.demo.product.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Auther: gexiao
 * @Date: 2019/6/11 17:13
 * @Description:
 */
@Getter
@AllArgsConstructor
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架"),

    ;

    private Integer code;
    private String  message;


}
