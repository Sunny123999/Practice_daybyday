package com.briup.java.day4;

public class Test1 {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int sum = add(x,y);
        System.out.println("sum="+sum);
        print();

    }

    public static int add(int x,int y){
        int sum = x+y;
        return sum;
    }
     public static void print(){
         System.out.println("jiayou!!!!");
     }

}
