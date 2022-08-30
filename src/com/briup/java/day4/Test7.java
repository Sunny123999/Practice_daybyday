package com.briup.java.day4;

import java.util.Scanner;
public class Test7{
    public static void main(String[] args){
        //获取用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请随机输入一个十进制整数：");

        //检验用户输入的数值是否符合要求
        if(sc.hasNextInt()){
            int num=sc.nextInt();
            if(num>=0){
                System.out.print("十进制"+num+"的二进制为：");
                int x=1, y=0;
                String binary="";
                while(x!=0){
                    x=num/2;
                    y=num%2;
                    num=x;
                    binary+=y;
                }
                for(int i=binary.length()-1;i>=0;i--){
                    System.out.print(binary.charAt(i));
                }
            }else{
                System.out.println("您输入的数值有误，请重新输入。");
            }
        }else{
            System.out.println("您输入的数值有误，请重新输入。");
        }
    }
}

