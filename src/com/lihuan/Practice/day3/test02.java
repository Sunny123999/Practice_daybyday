package com.lihuan.Practice.day3;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/12 15:46
 * @Description ：
 */
public class test02 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1;i < 200;i+=2) {
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(i);j++) {
                if(i%j==0) {
                    flag=false;
                    break;
                }
            }
            if(flag) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}

