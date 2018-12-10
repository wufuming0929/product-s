package com.formain.server.common;


import com.formain.server.vo.ResultVo;

/**
 * 项目名称：product
 * 包： com.formain.product.common
 * 类名称：ResultUtil.java
 * 类描述：用来封装返回值的工具
 * 创建人：wufuming
 * 创建时间：2018年11月18日
 */
public class ResultUtil {

    public static <T> ResultVo<T> success(T data){

        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        resultVo.setData(data);
        return resultVo;
    }

}