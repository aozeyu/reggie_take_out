package com.itheima.reggie_take_out.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie_take_out.entity.User;
import com.itheima.reggie_take_out.mapper.UserMapper;
import com.itheima.reggie_take_out.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @program: reggie_take_out
 * @description: 333
 * @packagename: com.itheima.reggie_take_out.service.impl
 * @author: 姚泽宇
 * @date: 2022-07-01 14:14
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
