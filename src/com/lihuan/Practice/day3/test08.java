package com.lihuan.Practice.day3;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/12 16:13
 * @Description ：
 */

import java.util.Scanner;
public class test08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        int sum = 0, b = 0;
        for (int i = 0; i < n; i++) {
            b += a; //1  11  100+11
            sum += b; //1  1+11  1+11+111
            a = a * 10; //10  100
        }
        System.out.println(sum);
    }

}
