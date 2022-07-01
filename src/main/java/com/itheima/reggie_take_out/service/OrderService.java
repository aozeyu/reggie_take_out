package com.itheima.reggie_take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie_take_out.entity.Orders;

/**
 * @program: reggie_take_out
 * @description: 333
 * @packagename: com.itheima.reggie_take_out.service
 * @author: 姚泽宇
 * @date: 2022-07-01 16:42
 **/
public interface OrderService extends IService<Orders> {
    public void submit(Orders orders);
}
