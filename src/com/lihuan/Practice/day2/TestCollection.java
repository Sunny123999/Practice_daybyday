package com.lihuan.Practice.day2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author ：sunny
 * @date ：Created in 2022/5/31 10:58
 * @description：测试容器
 * @modified By：
 * @version: $
 */
public class TestCollection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList();
        collection.size();
        System.out.println(collection.isEmpty());
        collection.add("小老板那！！！");
        System.out.println(collection);
        System.out.println(collection.size());
        collection.remove("小");
        System.out.println(collection);
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection);
        System.out.println(collection.size());
        collection.add("sadasdas");
        collection.toArray();
        Object[] objects = collection.toArray();
        System.out.println(objects);
    }
}
