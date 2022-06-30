package com.itheima.reggie_take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie_take_out.entity.Dish;
import com.itheima.reggie_take_out.entity.DishDto;

/**
 * @program: reggie_take_out
 * @description: 333
 * @packagename: com.itheima.reggie_take_out.service
 * @author: 姚泽宇
 * @date: 2022-06-30 15:22
 **/
public interface DishService extends IService<Dish> {

   public void saveWithFlavor(DishDto dishDto);
   public DishDto getByIdWithFlavor(Long id);
   //更新菜品信息，同时更新对应的口味信息
   public void updateWithFlavor(DishDto dishDto);
}
