package com.itheima.reggie_take_out.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @program: reggie_take_out
 * @description: ee
 * @packagename: com.itheima.reggie_take_out.common
 * @author: 姚泽宇
 * @date: 2022-06-30 15:25
 **/
@Slf4j
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }


}
