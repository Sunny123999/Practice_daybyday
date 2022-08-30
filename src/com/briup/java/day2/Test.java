package com.briup.java.day2;

public class Test {
    public static void main(String[] args) {
//        double a = Math.random();
//        System.out.println(a);

        int x = (int)(6*(Math.random()));
        System.out.println(x);
        if (x<=3){
            System.out.println("小了");
        }else {
            System.out.println("大了");
        }

    }
}
