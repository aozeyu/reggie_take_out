package com.itheima.reggie_take_out.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: reggie_take_out
 * @description: 333
 * @packagename: com.itheima.reggie_take_out.entity
 * @author: 姚泽宇
 * @date: 2022-06-30 16:35
 **/
@Data
public class DishDto extends Dish{
    private List<DishFlavor> flavors = new ArrayList<>();
    private String categoryName;
    private Integer copies;
}
