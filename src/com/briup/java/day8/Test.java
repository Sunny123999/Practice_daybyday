package com.briup.java.day8;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[4];
        int[] b = new int[4];
        //初始化数组元素的值
        for(int i=0;i<a.length;i++){
            a[i] = 100*i;
        }
        for (int j=0;j<b.length;j++){
            b[j] = 2*j-1;
        }
        //读取元素的值
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for (int j =0;j<b.length;j++){
            System.out.println(b[j]);
        }
        for (int temp:b){
            System.out.println(temp);
        }
    }
}
