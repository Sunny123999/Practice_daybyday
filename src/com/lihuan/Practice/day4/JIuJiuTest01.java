package com.lihuan.Practice.day4;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/16 17:20
 * @Description ：
 */
public class JIuJiuTest01 {
    public static void main(String[] args) {
        for (int i =1 ;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
