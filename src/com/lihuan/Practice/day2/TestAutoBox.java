package com.lihuan.Practice.day2;

/**
 * @author ：sunny
 * @date ：Created in 2022/5/30 11:25
 * @description：
 * @modified By：
 * @version: $
 */
public class TestAutoBox {
    public static void main(String[] args) {
        Integer a = 234; //自动装箱  Integer a = Integer.value(234);
        int b = a; //自动拆箱

        Integer c = null;
        //int d = c;

        Integer e1 = -128;
        Integer e2 = -128;
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));

    }
}
