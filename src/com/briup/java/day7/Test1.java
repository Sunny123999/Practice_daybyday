package com.briup.java.day7;

class Person1 {
    String name;
    int age;
    @Override
    public String toString() {
        return name+",年龄："+age;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Person1 p=new Person1();
        p.age=20;
        p.name="李东";
        System.out.println("info:"+p);

        Test1 t = new Test1();
        System.out.println(t);
    }
}
