package com.briup.java.day3;

public class Test3 {
    public static void main(String[] args) {
        int sum01 = 0;
        int sum02 = 0;
        for (int i =1;i<=100;i++){
            if (i%2==0){
                sum01 = sum01+i;
            }else {
                sum02 = sum02+i;
            }
        }
        System.out.println("偶数和："+sum01);
        System.out.println("奇数和："+sum02);

        for (int i =1 ;i<=1000;i++){
            if (i%5==0) {
                System.out.print(i+"\t");
            }
            if (i%25==0){
                System.out.println();
            }
        }

    }
}
