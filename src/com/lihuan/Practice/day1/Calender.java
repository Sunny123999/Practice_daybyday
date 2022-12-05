package com.lihuan.Practice.day1;

/**
 * @author ：sunny
 * @date ：Created in 2022/5/17 15:32
 * @description：打印当天的动态日历
 * @modified By：
 * @version: $1.0
 */
public class Calender {
    public static void main(String[] args) {
        int year = 2022;
        int month = 5;
        int day = 17;
        int week = 3;
        int days = 31;
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for (int i = 0; i < week; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= days; i++) {
            System.out.print(i + "\t");
            if ((i + week) % 7 == 0) {
                System.out.println();
            }
        }
    }
}