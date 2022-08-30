package com.briup.java.day5;

public class TestStu {
    int id;
    String name;
    int age;
    void study(){
        System.out.println("!!!!!!!!!!!!!");
    }
    void play(){
        System.out.println("@@@@@@@@@@@@@@");
    }
    //构造方法
    TestStu(){
    }

    public static void main(String[] args) {
        TestStu stu = new TestStu();
        stu.play();
    }

}
