package com.lihuan.Practice.day4;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/9/1 15:12
 * @Description ：
 */
public class TestCalender {
    public static void main(String[] args) {
        CalendarTest02 calendarTest02 = new CalendarTest02(2022,9);
        int days = calendarTest02.getTotalDaysFrom1900();
        calendarTest02.print();
    }
}
