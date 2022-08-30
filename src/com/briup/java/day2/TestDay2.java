package com.briup.java.day2;

import java.util.Scanner;

public class TestDay2 {
    public static void main(String[] args) {

        int x = 100;
        int y = 200;
        String grade = x<y?"对的":"不对";
        if (x<y){
            System.out.println("1");
        }else {
            System.out.println("2");
        }
        System.out.println(grade);

        int a = 232;
        long b = a;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String name = scanner.nextLine();
        System.out.println("请输入");
        String hobby = scanner.nextLine();
        System.out.println(name);
        System.out.println(hobby);
    }

}
