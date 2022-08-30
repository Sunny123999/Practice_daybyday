package com.briup.java.day3;

public class TestIfElse {
    public static void main(String[] args) {

        System.out.println("***************************");

        double r = 4*Math.random();
        double area = Math.PI*Math.pow(r,2);
        double circle = 2*Math.PI*r;
        System.out.println("半径为："+r);
        System.out.println("面积为："+area);
        System.out.println("周长为:"+circle);

        if (area>circle){
            System.out.println("面积大于周长");
        }else if(circle>area){
            System.out.println("周长大于面积");
        }else {
            System.out.println("周长等于面积");
        }

        System.out.println("*************************");
        int age = (int)(100*Math.random());
        System.out.println("年龄室："+age);
        if (age<18){
            System.out.println("未成年");
        }else if(age<25){
            System.out.println("特别好");
        }else if(age<45){
            System.out.println("年龄刚好");
        }else if (age<60){
            System.out.println("年龄还可以");
        }else {
            System.out.println("年龄大了");
        }

    }
}
