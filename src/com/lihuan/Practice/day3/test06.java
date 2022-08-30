package com.lihuan.Practice.day3;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/12 16:01
 * @Description ：
 */
/**在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，取得的余数作为下一轮循环的较小的数，如此循环直到较小的数的值为0，返回较大的数，此数即为最大公约数，最小公倍数为两数之积除以最大公约数。**/
import java.util.Scanner;
public class test06 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        test06 test=new test06();
        int i = test.gongyinshu(a, b);
        System.out.println("最小公因数"+i);
        System.out.println("最大公倍数"+a*b/i);
    }
    public int gongyinshu(int a,int b) {
        if(a<b) {
            int t=b;
            b=a;
            a=t;
        }
        while(b!=0) {
            if(a==b)
                return a;
            int x=b;
            b=a%b;
            a=x;
        }
        return a;
    }
}

