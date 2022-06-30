package com.itheima.reggie_take_out.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: reggie_take_out
 * @description: 通用结果类
 * @packagename: com.itheima.reggie_take_out.common
 * @author: 姚泽宇
 * @date: 2022-06-30 10:41
 **/
@Data
public class R<T> {
    private Integer code;
    private String msg;
    private T data;
    private Map map = new HashMap();

    public static <T> R<T> success(T object) {
        R<T> r = new R<T>();
        r.data = object;
        r.code = 1;
        return r;
    }

    public static <T> R<T> error(String msg) {
        R r = new R();
        r.msg = msg;
        r.code = 0;
        return r;
    }
    public R<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }
}
