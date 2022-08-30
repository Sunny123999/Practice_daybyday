package com.briup.java.day3;

public class TestFor {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        for (int i = 9; i > 0; i--) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i = 99;i>0;i=i-3){
            System.out.print(i+",");
        }
        for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i= " + i + " j= " + j);
        }
        for ( ; ; ) {    // 无限循环: 相当于 while(true)
            System.out.println("北京尚学堂");
        }

    }

}