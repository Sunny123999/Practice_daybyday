package com.lihuan.Practice.day3;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @description: Lambda表达式的使用
 */
public class TestLamnda {
    public static void main(String[] args) {
        // 1. 无参无返回值
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!1");
            }
        };
        runnable.run();
        System.out.println("-------------------------------");
        Runnable runnable1 = () -> System.out.println("Hello World!2");// Lambda表达式
        runnable1.run();
        System.out.println("-------------------------------");
        /*——————————————————————————————————————————————————————————————————————————————————————————————————————————————*/
        // 2. 有一个参数，无返回值
        // 2.1
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("Hello World!1");
        System.out.println("-------------------------------");
        // 2.2
        Consumer<String> consumer1 = (String s) -> System.out.println(s);
        consumer1.accept("Hello World!2");
        System.out.println("-------------------------------");
        // 2.3
        Consumer<String> consumer2 = (s) -> System.out.println(s);
        consumer2.accept("Hello World!");
        System.out.println("-------------------------------");
        /*——————————————————————————————————————————————————————————————————————————————————————————————————————————————*/
        // 3. 有两个参数，有返回值，并且Lambda体中有多条语句
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("函数式接口");
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(comparator.compare(1, 2));
        System.out.println("-------------------------------");
        Comparator<Integer> comparator1 = (o1, o2) -> {
            System.out.println("函数式接口");
            return Integer.compare(o1, o2);
        };
        System.out.println(comparator1.compare(1, 2));
        System.out.println("-------------------------------");
        /*——————————————————————————————————————————————————————————————————————————————————————————————————————————————*/
        // 4. 有两个参数，有返回值，并且Lambda体中只有一条语句
        Comparator<Integer> comparator2 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(comparator2.compare(1, 2));
        System.out.println("-------------------------------");
        /*——————————————————————————————————————————————————————————————————————————————————————————————————————————————*/
        // 5. Lambda表达式的参数列表的数据类型可以省略不写，因为JVM编
        // 译器通过上下文推断出，数据类型，即“类型推断”
        Comparator<Integer> comparator3 = (Integer o1, Integer o2) -> Integer.compare(o1, o2);
        System.out.println(comparator3.compare(1, 2));
        System.out.println("-------------------------------");
        /*——————————————————————————————————————————————————————————————————————————————————————————————————————————————*/
        // 6. Lambda表达式需要“函数式接口”的支持
        // 函数式接口：接口中只有一个抽象方法的接口，称为函数式接口。可以
        // 通过注解@FunctionalInterface修饰，可以检查是否是函数式接口
        // 7. Lambda表达式的使用：（分为6种情况介绍）
        // 总结：
        // ->左边：Lambda表达式的参数列表
        // ->右边：Lambda表达式中所需要执行的功能，即Lambda体
    }
}