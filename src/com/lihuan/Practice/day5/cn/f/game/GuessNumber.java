package com.lihuan.Practice.day5.cn.f.game;

import java.util.Scanner;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/17 15:19
 * @Description ：猜数字游戏
 */
public class GuessNumber {
    private GuessNumber(){

    }

    public static void start(){
        //产生一个随机数
        int number=(int)(Math.random()*100)+1;
        //定义一个统计变量
        int count = 0;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数据(1-100): ");
            int guessNumber = sc.nextInt();
            count++;
            if (guessNumber>number){
                System.out.println("你猜的数据"+guessNumber+"大了");
            }else if (guessNumber<number){
                System.out.println("你猜的数据"+guessNumber+"小了");
            }else {
                System.out.println("恭喜你，第"+count+"次猜中了");
                break;
            }
        }
    }
}
