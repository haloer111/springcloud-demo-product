package com.gexiao.demo.product.utils;

import com.gexiao.demo.product.vo.ResultVo;

/**
 * @Auther: gexiao
 * @Date: 2019/6/11 17:52
 * @Description:
 */
public class ResultVoUtil {

    public static ResultVo success(Object data){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        resultVo.setData(data);
        return resultVo;
    }
}
