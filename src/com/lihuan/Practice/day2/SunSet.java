package com.lihuan.Practice.day2;

import java.util.HashMap;

/**
 * @author ：sunny
 * @date ：Created in 2022/6/1 15:49
 * @description ：手动实现Set
 */
public class SunSet {

    HashMap map;

    private static final Object PRESENT = new Object();

    public SunSet(){
        map = new HashMap();
    }

    public int size(){
        return map.size();
    }

    public void add(Object o){
        map.put(o,PRESENT);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (Object key:map.keySet()){
            stringBuilder.append(key+",");
        }
        stringBuilder.setCharAt(stringBuilder.length()-1,']');
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        SunSet sunSet = new SunSet();
        SunSet sunSet1 = new SunSet();
        SunSet sunSet2 = new SunSet();
        SunSet sunSet3 = new SunSet();
        SunSet sunSet4 = new SunSet();
        sunSet.add("aaaa");
        sunSet.add("bbbb");
        sunSet.add("cccc");
        System.out.println(sunSet);
        System.out.println(sunSet.size());
    }

}
