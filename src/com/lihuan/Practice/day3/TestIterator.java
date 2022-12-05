package com.lihuan.Practice.day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestIterator {
    public static void main(String[] args) {
        Map<Integer, String> map01 = new HashMap();
        HashMap<Object, Object> map02 = new HashMap<>();
        map01.put(1, "Java");
        map01.put(2, "C++");
        map01.put(3, "PHP");
        Iterator<Map.Entry<Integer, String>> iterator = map01.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
