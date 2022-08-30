package com.briup.java.day6;

public class TestThis {
    int x,y,z;

    TestThis(){
        System.out.println("初始化");
    }
    TestThis(int x,int y){
        //TestThis();
        this();
        x=x;
        this.x=x;
        this.y=y;
    }
    TestThis(int x,int y,int z){
        this(x,y);
        this.z=z;
    }
    void sing(){

    }
    void eat(){
        this.sing();
        System.out.println("吃饭了");
    }


    public static void main(String[] args) {
        TestThis HI = new TestThis();
        HI.eat();
    }
}
