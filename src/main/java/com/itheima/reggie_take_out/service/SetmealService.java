package com.itheima.reggie_take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie_take_out.entity.Setmeal;
import com.itheima.reggie_take_out.entity.SetmealDto;

import java.util.List;

/**
 * @program: reggie_take_out
 * @description: 333
 * @packagename: com.itheima.reggie_take_out.service
 * @author: 姚泽宇
 * @date: 2022-06-30 15:23
 **/
public interface SetmealService extends IService<Setmeal> {
  public void saveWithDish(SetmealDto setmealDto);
  public void removeWithDish(List<Long> ids);
}
