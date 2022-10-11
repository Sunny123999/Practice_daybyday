package com.lihuan.Practice.day6;

import java.text.SimpleDateFormat;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/9/30 9:46
 * @Description ：打印当前时间
 */
public class Test {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
        System.out.println(simpleDateFormat.format(System.currentTimeMillis()));
        System.out.printf(String.valueOf(System.currentTimeMillis()));
    }
}
