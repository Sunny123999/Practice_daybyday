package com.lihuan.Practice.day2;

/**
 * @author ：sunny
 * @date ：Created in 2022/5/30 11:35
 * @description：可视化日历程序
 * @modified By：
 * @version: $
 */

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCalendar {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入日期（格式为：2010-3-3）：");
        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine(); // 2010-3-1
        // 将输入的字符串转化成日期类
        System.out.println("您刚刚输入的日期是：" + dateString);
        String[] str = dateString.split("-");
        int year = Integer.parseInt(str[0]);
        int month = new Integer(str[1]);
        int day = new Integer(str[2]);
        Calendar c = new GregorianCalendar(year, month - 1, day);// 月份从0开始
        // 大家自己补充另一种方式：将字符串通过SImpleDateFormat转化成Date对象，
        //再将Date对象转化成日期类
        // SimpleDateFormat sdfDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Date date = sdfDateFormat.parse(dateString);
        // Calendar c = new GregorianCalendar();
        // c.setTime(date);
        // int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, 1);// 将日期设置为当月第一天
        int dow = c.get(Calendar.DAY_OF_WEEK); // week:1-7 日一二三四五六
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for (int i = 0; i < dow - 1; i++) {
            System.out.print("\t");
        }
        int maxDate = c.getActualMaximum(Calendar.DATE);// 获取当月最大天数
        // System.out.println("maxDate:"+maxDate);
        for (int i = 1; i <= maxDate; i++) {
            StringBuilder sBuilder = new StringBuilder();
            if (c.get(Calendar.DATE) == day) {
                sBuilder.append(c.get(Calendar.DATE) + "*\t");// 今天
            } else {
                sBuilder.append(c.get(Calendar.DATE) + "\t");// 其他日期
            }
            System.out.print(sBuilder);
            // System.out.print(c.get(Calendar.DATE)+
            //                ((c.get(Calendar.DATE)==day)?"*":"")+"\t");

            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {// 7
                System.out.print("\n");// 换行
            }
            c.add(Calendar.DATE, 1);
        }
    }
}
