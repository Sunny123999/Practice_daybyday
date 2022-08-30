package com.lihuan.Practice.day3;

/**
 * @author ：sunny
 * @date ：Created in 2022/8/9 17:58
 * @description ：
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String sys = "信息管理";// 字义一个字符串表示系统名称
        System.out.println("欢迎进入《" + sys + "》系统");// 输出系统名称
        System.out.println("请设置一个管理员密码(要求密码长度在6-12)：");
        Boolean flag = true;
        while (flag) {
            Scanner input = new Scanner(System.in);
            String pass = input.next();// 获取用户输入的密码
            int length = pass.length();// 获取密码的长度
            if (length > 6 && length < 12) {
                System.out.println("密码长度符合规定。");
                System.out.println("已生效，请牢记密码：" + pass);
                flag = false;
            } else if (length >= 12) {
                System.out.println("密码过长，请重新输入。");
            } else {
                System.out.println("密码过短，请重新输入。");
            }
        }
    }
}
