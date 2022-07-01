package com.itheima.reggie_take_out.controller;

import com.itheima.reggie_take_out.service.OrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: reggie_take_out
 * @description: 333
 * @packagename: com.itheima.reggie_take_out.controller
 * @author: 姚泽宇
 * @date: 2022-07-01 16:50
 **/
@Slf4j
@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;
}
