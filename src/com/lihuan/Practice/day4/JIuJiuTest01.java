package com.lihuan.Practice.day4;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/16 17:20
 * @Description ：九九乘法表
 */
public class JIuJiuTest01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {//控制行数
            for (int j = 1; j <= i; j++) {//控制列数
                System.out.print(j + "*" + i + "=" + i * j + "\t");//\t制表符
            }
            System.out.println();
        }
    }
}
