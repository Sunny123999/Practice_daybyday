package com.lihuan.Practice.day3;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/12 16:20
 * @Description ：
 */

public class test09 {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++) {
            int t = 0;
            for(int j=1;j<=i/2;j++) {
                if(i%j==0) {
                    t+=j;
                }
            }
            if(t==i) {
                System.out.println(i);
            }
        }
    }
}

