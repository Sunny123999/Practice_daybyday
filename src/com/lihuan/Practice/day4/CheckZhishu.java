package com.lihuan.Practice.day4;

import java.util.Random;
import java.util.Scanner;

/**
 * 判断输入的数是否为质数
 */
public class CheckZhishu {
    public static void main(String[] args) {
        System.out.println("请输入一个数: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;  //默认是质数
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false; //不是质数
                break;
            }
        }
        System.out.println(num + (flag ? " 是" : " 不是") + "质数");

        System.out.println("***************************************");
        System.out.println("输出10个1-10之间的随机数:");
        Random random = new Random(); //1-10 0-9
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(10) + 1;
            System.out.println(number);
        }

        System.out.println("***************************************");
        //偶数就取二分之一 奇数就扩大两倍
        for (int i = 0; i < 10; i++) {
            int testNum = random.nextInt(10) + 1;
            System.out.println("随机数是: " + testNum);
            if (testNum % 2 == 0) {
                testNum = testNum / 2;
            } else {
                testNum = testNum * 2;
            }
            System.out.println("判断后进行运算后的数是(奇数扩大两倍,偶数除以2): "+testNum);
        }

    }
}
