package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;

/**
 * 自定义异常类
 *
 * @author YJB
 * 2019-07-02
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message) {
        super(message);
        this.code = code;
    }
}
