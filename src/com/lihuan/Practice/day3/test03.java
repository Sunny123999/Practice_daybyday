package com.lihuan.Practice.day3;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/12 15:54
 * @Description ：
 */

public class test03 {
    public static void main(String[] args) {
        int a, b, c;
        for (int i = 101; i < 1000; i++) {
            a = i % 10;
            b = i / 10 % 10;
            c = i / 100;
            if (a * a * a + b * b * b + c * c * c == i)
                System.out.println(i);
        }
    }
}

