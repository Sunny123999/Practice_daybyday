package com.lihuan.Practice.day2;

import java.util.Random;

/**
 * @Description 测试random
 * @Author Sunny*
 * @Date Created in 2022/11/24 10:45
 */
public class TestRandom {
    public static void main(String[] args) {
        // 生成一个0-1之间的随机数
        double random = Math.random();
        System.out.println(random);
        // 生成一个1-100之间的随机数
        int random1 = (int) (Math.random() * 100 + 1);
        System.out.println(random1);
        Random random2 = new Random();// 生成一个随机数对象
        //生成一个随机1-100之间的整数
        int i = random2.nextInt(100) + 1;
        System.out.println(i);
        System.out.println(Math.random());// 生成一个0-1之间的随机数
        // 生成一个10-15的随机整数  0-1
        Random random3 = new Random();
        int num2 = random2.nextInt(6) + 10;
        // 生成一个23-47的随机整数
        Random random4 = new Random();
        int num3 = random3.nextInt(47 - 23 + 1) + 23;
    }
}
