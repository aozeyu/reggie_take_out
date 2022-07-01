package com.itheima.reggie_take_out.entity;

import lombok.Data;

import java.util.List;

/**
 * @program: reggie_take_out
 * @description: 333
 * @packagename: com.itheima.reggie_take_out.entity
 * @author: 姚泽宇
 * @date: 2022-06-30 19:42
 **/
@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;//套餐关联的菜品集合

    private String categoryName;//分类名称


}
