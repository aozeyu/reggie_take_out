package com.itheima.reggie_take_out.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie_take_out.entity.Employee;
import com.itheima.reggie_take_out.mapper.EmployeeMapper;
import com.itheima.reggie_take_out.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @program: reggie_take_out
 * @description: 333
 * @packagename: com.itheima.reggie_take_out.service.impl
 * @author: 姚泽宇
 * @date: 2022-06-30 10:35
 **/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>  implements EmployeeService {
}
