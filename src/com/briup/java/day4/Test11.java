package com.briup.java.day4;

public class Test11 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println("∑1+∑2+...+∑100=" + sum);
    }
}

