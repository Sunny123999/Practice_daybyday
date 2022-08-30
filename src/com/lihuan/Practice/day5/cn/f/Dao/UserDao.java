package com.lihuan.Practice.day5.cn.f.Dao;

import com.lihuan.Practice.day5.cn.f.pojo.User;

public interface UserDao {
    //登录功能
    public abstract boolean isLogin(String name,String password);
    //注册功能
    public abstract void regist(User user);
}
