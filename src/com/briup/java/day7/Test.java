package com.briup.java.day7;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("高淇", 172, "Java");
        s.study();
        s.rest();
    }
}

    class Person{
        public int id;
        String name;
        int height;
        public void rest(){
            System.out.println("休息一会儿！！");
        }
    }

     class Student extends Person{
        String major;//专业
        public void study(){
            System.out.println("我在学习java!!!");
        }
        public Student(String name,int height,String major){
            //天然拥有父类的属性
            this.name = name;
            this.height = height;
            this.major = major;
        }
    }

