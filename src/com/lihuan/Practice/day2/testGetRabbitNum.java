package com.lihuan.Practice.day2;

import java.util.Scanner;

/**
 * @Description 有一对兔子，从出生后第3个月起都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月兔子的对数为多少？
 * @Author Sunny*
 * @Date Created in 2022/11/30 18:17
 * 步骤：  1.定义一个变量，用来控制月份
 * 2.定义一个变量，用来控制兔子对数
 * 第一个月：1对    第二个月：1对   第三个月：2对   第四个月：3对   第五个月：5对   第六个月：8对  第七个月：13对
 */
public class testGetRabbitNum {
    public static void main(String[] args) {
        System.out.println("请输入要判断的月数：");
        int month = new Scanner(System.in).nextInt();
        System.out.println("第" + month + "月兔子的对数为：" + getSum(month));
    }

    public static int getSum(int month) {
        //如果是前两个月，还是1对兔子
        if (month == 1 || month == 2) {
            return 1;
        } else {
            //从第三个开始，兔子按照2 3 5 8 13 21变化
            return getSum(month - 1) + getSum(month - 2);
        }
    }
}
