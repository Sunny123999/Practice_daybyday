package com.lihuan.Practice.day2;

import java.util.Scanner;

/**
 * @Description 斐波那契数列
 * @Author Sunny*
 * @Date Created in 2022/11/30 18:06
 */
public class testFabnaic {
    public static void main(String[] args) {
        System.out.println("请输入您要测试的数列个数:");
        @SuppressWarnings("resource")//去除警告
        int n = new Scanner(System.in).nextInt();//接收数列个数
        // 判断n是否是不正常的范围
        if (n < 1) {
            System.out.println("输入数列长度有误！！！");
        }
        if (n == 1) {
            System.out.println(0);
        }
        if (n == 2) {
            System.out.println(0 + "\t" + 1);
        }
        if (n == 3) {
            System.out.println(0 + "\t" + 1 + "\t" + 1);
        }
        if (n > 3) {// 拼接前3项
            System.out.print(0 + "\t" + 1 + "\t" + 1 + "\t");
        }
        // 循环输出后面的数据
        int f1 = 1;
        int f2 = 1;
        int next = 0;
        for (int i = 4; i <= n; i++) {
            next = f1 + f2;
            f1 = f2;
            f2 = next;
            System.out.print(next + "\t");
        }
    }
}
