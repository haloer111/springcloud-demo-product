package com.gexiao.demo.product.vo;

import lombok.Data;

/**
 * @Auther: gexiao
 * @Date: 2019/6/11 17:24
 * @Description:
 */
@Data
public class ResultVo<T> {

    private Integer code;
    private String msg;
    private T data;
}
