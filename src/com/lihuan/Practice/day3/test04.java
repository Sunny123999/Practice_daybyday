package com.lihuan.Practice.day3;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/12 15:58
 * @Description ：
 */

import java.util.Scanner;
public class test04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=2;
        while(n>=k) {
            if(n==k) {
                System.out.println(k);
                break;
            }else if (n%k==0) {
                System.out.println(k);
                n=n/k;
            }else {
                k++;
            }
        }
    }
}

