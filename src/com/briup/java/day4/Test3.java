package com.briup.java.day4;

public class Test3 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(1);
        System.out.println(3.0);
        System.out.println(add(3,5));
        System.out.println(add(3.4,5.6));
    }

    public static int add(int n1,int n2){
        int sum = n1+n2;
        return sum;
    }

    public static double add(double n1,double n2){
        double sum = n1+n2;
        return sum;
    }

    public static double add(double n1,double n2,double n3){
        double sum = n1+n2+n3;
        return sum;
    }

}
