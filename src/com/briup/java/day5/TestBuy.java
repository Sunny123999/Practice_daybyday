package com.briup.java.day5;

class Shops{
    String brand;
}

public class TestBuy {

    int date;
    String name;
    float price;
    Shops shops;
    void buy(){
        System.out.println("买了一台"+shops.brand);
    }
    TestBuy(){
    }

    public static void main(String[] args) {
        TestBuy br = new TestBuy();
        br.name = "李四";
        Shops com = new Shops();
        com.brand = "Dell";
        br.shops = com;
        br.buy();
    }
}
