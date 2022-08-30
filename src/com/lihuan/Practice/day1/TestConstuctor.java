package com.lihuan.Practice.day1;

/**
 * @author ：sunny
 * @date ：Created in 2022/5/22 17:40
 * @description：测试控制器
 * @modified By：
 * @version: $
 */
public class TestConstuctor {

    int id;
    String name;
    String password;

    public TestConstuctor(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public static void main(String[] args) {
        TestConstuctor testConstuctor = new TestConstuctor(1001,"阿欢","123456huan");
        System.out.println("id:"+testConstuctor.id+"\n"+"name:"+testConstuctor.name+"\n"+"password:"+testConstuctor.password);
        //System.out.println("\n");
    }
}
