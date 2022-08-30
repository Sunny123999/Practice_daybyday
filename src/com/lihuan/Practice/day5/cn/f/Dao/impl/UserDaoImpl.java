package com.lihuan.Practice.day5.cn.f.Dao.impl;

import com.lihuan.Practice.day5.cn.f.Dao.UserDao;
import com.lihuan.Practice.day5.cn.f.pojo.User;

import java.util.ArrayList;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/17 15:03
 * @Description ：
 */
public class UserDaoImpl implements UserDao {

    private static ArrayList<User> u = new ArrayList<User>();

    @Override
    public boolean isLogin(String name, String password) {
        boolean flag = false;
        for (User user : u) {
            if (user.getName().equals(name) && user.getPassword().equals(password)){
                flag = true;
            break;
        }
    }
    return flag;
}

    @Override
    public void regist(User user) {
        u.add(user);
    }
}
