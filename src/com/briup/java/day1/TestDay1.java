package com.briup.java.day1;

import java.math.BigDecimal;

public class TestDay1 {
    int hao = 1;
    String man = "福娃";
    char woman = 'a';
    final int age = 2;
    final double PI = 3.1415926;

    public static void main(String[] args) {
                System.out.println("Hello World!!!");
                TestDay1 S = new TestDay1();
                S.eat();
                int a = 15;
                int b = 015;
                int c = 0x14;
                int d = 0b1101;
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                byte age = 30;
                short man = 4000;
                int woman = 500000000;
                long population = 7000000000L;

                double pi = 314e2;
                float pi1 = 3.1f;
                float ew1 = 0.1f;
                float ew2 = ew1+1;
                if (ew1==ew2){
                    System.out.println("1");
                }
                else {
                    System.out.println("2");
                }
                BigDecimal bd = BigDecimal.valueOf(1);

                char T = '李';
                char J = 'd';
                System.out.println(T+J);

                String sg = "李欢";

                boolean man1 = true;
                if (man1){
                    System.out.println("男的");
                }

        System.out.println(9%2);

                int h = 3;
                int j = h++;
                int k = ++h;
        System.out.println("h="+h);
        System.out.println("j="+j);
        System.out.println("k="+k);

        int abc = 3;
        System.out.println(abc==3);
        System.out.println(abc!=3);
        System.out.println(abc<3);

        char bbb1 = 'a';
        char bbb2 = 'b';
        System.out.println((int)bbb1);
        System.out.println((int)bbb2);
        System.out.println(bbb1<bbb2);

        boolean acc = true;
        boolean bcc = false;
        System.out.println("acc && bcc = " + (acc&&bcc));
        System.out.println(acc&bcc);
        System.out.println("acc || bcc = " + (acc||bcc) );
        System.out.println("!(acc && bcc) = " + !(acc && bcc));
        System.out.println(acc^bcc);

        int add = 5;//定义一个变量；
        boolean bdd = (add<4)&&(add++<10);
        boolean cdd = (add<4)||(add++<10);


        System.out.println("使用短路与逻辑运算符的结果为"+bdd);
        System.out.println("使用短路或逻辑运算符的结果为"+cdd);


        System.out.println("add的结果为"+add);

        }//main end

    int eat(){
        int age;
        float price;
        double salary;
        boolean gender;
        System.out.println("汪汪汪！！！！");
        return 0;
    }
}
