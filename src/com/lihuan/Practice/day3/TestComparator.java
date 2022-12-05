package com.lihuan.Practice.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(-1);
        arrayList.add(9);
        arrayList.add(-4);
        arrayList.add(-8);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(-2);
        arrayList.add(7);
        arrayList.add(29);
        System.out.println("原始数组: ");
        System.out.println(arrayList);
        System.out.println("-------------------------------");
        Collections.reverse(arrayList);
        System.out.println("Collections.reverse(arrayList):");
        System.out.println(arrayList);
        System.out.println("-------------------------------");
        Collections.sort(arrayList);
        System.out.println("Collections.sort(arrayList): ");
        System.out.println(arrayList);
        System.out.println("-------------------------------");
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("定制排序后: ");
        System.out.println(arrayList);
    }
}
