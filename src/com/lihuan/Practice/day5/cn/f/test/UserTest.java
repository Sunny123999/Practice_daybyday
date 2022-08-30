package com.lihuan.Practice.day5.cn.f.test;

import com.lihuan.Practice.day5.cn.f.Dao.UserDao;
import com.lihuan.Practice.day5.cn.f.Dao.impl.UserDaoImpl;
import com.lihuan.Practice.day5.cn.f.game.GuessNumber;
import com.lihuan.Practice.day5.cn.f.pojo.User;

import java.util.Scanner;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/17 15:10
 * @Description ：
 */
public class UserTest {

    static Scanner sc = new Scanner(System.in);

    static UserDao ud = new UserDaoImpl();

    public static void main(String[] args) {
        while (true) {
            System.out.println("--------欢迎光临--------");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.退出");
            System.out.println("请输入你的操作:");

            String m = sc.nextLine();
            switch (m) {
                case "1":
                    denglu();
                    break;
                case "2":
                    zhuce();
                    break;
                case "3":
                default:
                    System.out.println("谢谢使用，欢迎下次再来！！");
                    System.exit(0);
            }
        }
    }

    public static void denglu() {
        System.out.println("--------登录界面（请先注册后在登录！）--------");
        System.out.println("请输入用户名：");
        String n = sc.nextLine();
        System.out.println("请输入密码：");
        String p = sc.nextLine();
        //调用登录功能
        boolean flag = ud.isLogin(n, p);
        if (flag) {
            System.out.println("登录成功!奖励你玩一把游戏");
            System.out.println("你是否要玩？y/n");
            while (true) {
                String r = sc.nextLine();
                if (r.equalsIgnoreCase("y")) {
                    GuessNumber.start();
                    System.out.println("是否继续游戏呢？y/n");
                } else {
                    break;
                }
            }
            System.out.println("谢谢使用，欢迎下次再来！");
            System.exit(0);
        } else {
            System.out.println("用户名或者密码有误，登录失败！");
        }
    }

    public static void zhuce() {
        System.out.println("--------注册界面--------");
        System.out.println("请输入用户名： ");
        String name = sc.nextLine();
        System.out.println("请输入密码：  ");
        String password = sc.nextLine();
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        ud.regist(user);
        System.out.println("注册成功！");
    }


}
