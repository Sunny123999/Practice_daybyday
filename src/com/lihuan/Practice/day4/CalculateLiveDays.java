package com.lihuan.Practice.day4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/30 11:44
 * @Description ：计算活了多少天
 */
public class CalculateLiveDays {
    public static void main(String[] args) throws ParseException {
        System.out.println("***********计算出生到现在多少天**********");
        System.out.println("请输入你的生日，日期格式yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        //格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //将字符类型的时间按照指定输出格式转化成Date类型输出
        Date b2 = sdf.parse(str);
        //获取当前时间
        Date time = new Date();

        //间隔天数
        long days = ((time.getTime() - b2.getTime()) / 1000 / 60 / 60 / 24);
        //判断
        if (days < 0) {
            System.out.println("你还没出生呢！！");
        } else {
            System.out.println("距离你出生已经过去了"+days+"天！");
        }
    }
}
