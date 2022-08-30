package com.lihuan.Practice.day3;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/12 15:37
 * @Description ：
 */
//这是一个菲波拉契数列问题
public class test01 {
    public static void main(String[] args) {
        int f1=1,f2=1,f;
        int M=30;
        System.out.println(f1);
        System.out.println(f2);
        for(int i=3;i<M;i++) {
            f=f2;
            f2=f1+f2;
            f1=f;
            System.out.println(f2);
        }
    }
}
//一 ---- 1  1
//二 ---- 1  1
//三 ---- 1  1  1  1
//四 ---- 1  1  1  1  1  1
//五 ---- 1  1  1  1  1  1  1  1  1  1