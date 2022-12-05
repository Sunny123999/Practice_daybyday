package com.lihuan.Practice.day3;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/12 16:01
 * @Description ：
 */

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        char grade = score >= 90 ? 'A' : score >= 60 ? 'B' : 'C';
        System.out.println(grade);
    }
}

