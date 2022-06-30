package com.itheima.reggie_take_out.common;

/**
 * @program: reggie_take_out
 * @description: ee
 * @packagename: com.itheima.reggie_take_out.common
 * @author: 姚泽宇
 * @date: 2022-06-30 15:25
 **/
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
