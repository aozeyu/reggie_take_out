package com.itheima.reggie_take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie_take_out.entity.Category;

/**
 * @program: reggie_take_out
 * @description: 333
 * @packagename: com.itheima.reggie_take_out.service
 * @author: 姚泽宇
 * @date: 2022-06-30 14:47
 **/

public interface CategoryService extends IService<Category> {
    public void remove(Long ids);
}
