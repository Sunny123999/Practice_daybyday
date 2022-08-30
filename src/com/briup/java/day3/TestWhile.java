package com.briup.java.day3;

public class TestWhile {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i<=100){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
