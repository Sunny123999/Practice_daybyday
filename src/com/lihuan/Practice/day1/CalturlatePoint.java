package com.lihuan.Practice.day1;

/**
 * @author ：sunny
 * @date ：Created in 2022/5/22 17:48
 * @description：计算两点之间的距离
 * @modified By：
 * @version: $
 */
public class CalturlatePoint {

    double x,y;

    public CalturlatePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double Calturlate(CalturlatePoint point){
        return Math.sqrt((x-point.x)*(x-point.x)+(y-point.y)*(y-point.y));
    }

    public static void main(String[] args) {
        CalturlatePoint C = new CalturlatePoint(3.0,4.0);
        CalturlatePoint P = new CalturlatePoint(0.0,0.0);
        System.out.println(C.Calturlate(P));
    }

}
