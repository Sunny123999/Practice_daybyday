package com.lihuan.Practice.day2;

/**
 * @Description 输出用*围住的正方形
 * @Author Sunny*
 * @Date Created in 2022/11/29 10:45

 */
public class testPrint {
    public static void main(String[] args) {
        //定义一个变量，用来控制行数
        int row = 5;
        //定义一个变量，用来控制列数
        int col = 10;
        //外层循环控制行数
        for (int i = 1; i <= row; i++) {
            //内层循环控制列数
            for (int j = 1; j <= col; j++) {
                //判断是否是第一行或者最后一行
                if (i == 1 || i == row) {
                    System.out.print("*");
                } else {
                    //判断是否是第一列或者最后一列
                    if (j == 1 || j == col) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
