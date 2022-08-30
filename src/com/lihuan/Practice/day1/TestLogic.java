package com.lihuan.Practice.day1;

/**
 * @author ：sunny
 * @date ：Created in 2022/5/17 16:18
 * @description：
 * @modified By：
 * @version: $
 */
public class TestLogic {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1&b2);
        System.out.println(b1|b2);
        System.out.println(!b2);
        System.out.println(b1^b2);

        //测试短路
        //int b3 = 3/0;
        boolean b3 = 1>2 &&  (4<3/0);
        System.out.println(b3);

    }
}
