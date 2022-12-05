package com.lihuan.Practice.day4;

public class TestShuiXianShu {
    public static void main(String[] args) {
        int num = 100;
        while (num <= 999) {
            int gewei = num % 10;       //个位
            int shiwei = num / 10 % 10; //十位
            int baiwei = num / 100;     //百位
            if ((gewei * gewei * gewei) + (shiwei * shiwei * shiwei) + (baiwei * baiwei * baiwei) == num) {
                System.out.println("100-999的水仙数: " + num);
            }
            num++;
        }
    }
}
