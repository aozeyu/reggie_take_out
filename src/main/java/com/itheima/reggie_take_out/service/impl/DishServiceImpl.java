package com.itheima.reggie_take_out.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie_take_out.common.CustomException;
import com.itheima.reggie_take_out.entity.Dish;
import com.itheima.reggie_take_out.entity.Setmeal;
import com.itheima.reggie_take_out.mapper.DishMapper;
import com.itheima.reggie_take_out.service.DishService;
import com.itheima.reggie_take_out.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: reggie_take_out
 * @description: 333
 * @packagename: com.itheima.reggie_take_out.service.impl
 * @author: 姚泽宇
 * @date: 2022-06-30 15:23
 **/
@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {

}