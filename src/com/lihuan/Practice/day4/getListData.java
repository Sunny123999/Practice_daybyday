package com.lihuan.Practice.day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试集合的数据添加获取
 */
public class getListData {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("小明");
        list.add("小红");
        list.add("小刚");
        System.out.println(list);
        System.out.println(list.get(1));
        HashMap<String, Object> map = new HashMap<>();
        map.put("1", "小明");
        map.put("2", "小红");
        map.put("3", "小刚");
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("4", "小明");
        map1.put("5", "小红");
        map1.put("6", "小刚");
        System.out.println(map);
        System.out.println(map.get("1"));
        List<Map<String, Object>> list01 = new ArrayList<Map<String, Object>>();
        list01.add(map);
        list01.add(map1);
        System.out.println(list01);
        System.out.println(list01.get(0).get("1"));
    }
}
