package com.lihuan.Practice.day2;

/**
 * @author ：sunny
 * @date ：Created in 2022/6/2 18:43
 * @description ：激活多线程
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        ThreadDemo threadDemo = new ThreadDemo();
//        TestThread testThread = new TestThread();
//        testThread.run();
        new TestThread().start();
        for (int i =0;i<5;i++){
            System.out.println("main线程在运行！！"+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class TestThread extends Thread{
    public void run(){
        for (int i =0;i<5;i++){
            System.out.println("ThestThread在运行！"+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}