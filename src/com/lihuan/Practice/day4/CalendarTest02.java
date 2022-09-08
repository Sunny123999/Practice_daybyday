package com.lihuan.Practice.day4;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/9/1 14:35
 * @Description ：
 */
public class CalendarTest02 {
    private int year;//2022
    private int month;//1

    /*构造器*/
    public CalendarTest02(int year, int month) {
        this.year = year;
        this.month = month;
    }

    //判断制定年份是否是闰年
    public boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    //计算从1900年1月份到目标年份的，月份前一个月的总天数
    public int getTotalDaysFrom1900() {

        int days = 0;
        //计算整年的天数
        for (int i = 1900; i < year; i++) {
            days+=isLeapYear(i)?366:365;
        }
        //计算整月的天数
        for (int i = 0;i<month;i++){
            days += getDayoOfMonth(i);
        }
        return days;
    }

    //根据提供的月份获取当月的总天数
    public int getDayoOfMonth(int i){
        switch (i){
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year)?29:28;
            default:
                return 31;
        }
    }

    public void print(){
        //获取打印当前月信息时要输出的空格数
        int spaces = getTotalDaysFrom1900()%7;
        //获取当前月份的总天数
        int days = getDayoOfMonth(month);
        //打印输出
        System.out.println("\t\t               动态日历");
        System.out.println("\t\t  【"+year+"】年【"+month+"】月");
        System.out.println("==================================================");
        System.out.println("一\t二\t三\t四\t五\t六\t日");
        System.out.println("==================================================");
        //初始化计数器，同时是否到达7的倍数75
        int count = 0;
        for (int i=0;i<spaces;i++){
            System.out.println("\t");
            count++;
        }
        for (int i=1;i<days;i++){
            System.out.println(i+"\t");
            count++;
            if (count%7==0){
                System.out.println();
            }
        }

    }
}
