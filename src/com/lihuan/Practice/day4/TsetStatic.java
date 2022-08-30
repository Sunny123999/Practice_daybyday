package com.lihuan.Practice.day4;

/**
 * @author ：sunny
 * @date ：Created in 2022/8/19 15:56
 * @description ：
 */
public class TsetStatic {
    static int cut = 6;
    static {
        cut = cut + 9;
    }

    public static void main(String[] args) {
        System.out.println("cut ="+cut);
        Boolean flag = false;
        if(flag = true){
            System.out.println("true");
        }else{
            System.out.println("flase");
        }
    }
    static {
        cut = cut/3;
    }


}
