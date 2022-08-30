package com.lihuan.Practice.day4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/16 14:16
 * @Description ：
 */
public class Days {

    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        //日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //某天的日期
        Date da1 = sdf.parse("1998-02-15");
        System.out.println(d);
        System.out.println(da1);
        //间隔天数     getTime获取毫秒数
        System.out.println("某天的日期:  "+sdf.format(da1));
        System.out.println("当前的日期:  "+sdf.format(d));
        System.out.println("间隔天数:  "+(d.getTime()-da1.getTime())/24/60/60/1000);
        long days = (d.getTime()-da1.getTime())/24/60/60/1000;
        System.out.println(days);
        if (days>90){
            System.out.println("超过90天未修改密码，转到修改密码界面，请修改密码");
        }else {
            System.out.println("登录成功！");
        }
    }
}
