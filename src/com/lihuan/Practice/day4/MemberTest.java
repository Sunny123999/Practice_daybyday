package com.lihuan.Practice.day4;

import java.util.Scanner;

public class MemberTest {
    public static void main(String[] args) {
        Member admin = new Member("admin", "123456");    // 创建用户对象
        Scanner input = new Scanner(System.in);
        System.out.println("请输入原密码：");
        String pwd = input.next();    // 获取用户输入的原密码
        if (pwd.equals(admin.getPassword())) {
            // 对用户输入的密码进行验证
            System.out.println("请输入新密码：");
            admin.setPassword(input.next());    // 获取用户输入的新密码
        } else {
            System.out.println("输入的密码错误，无法进行修改！");
        }
        System.out.println("----------------用户信息----------------\n" + admin);
    }
}

