package com.lihuan.Practice.day2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：sunny
 * @date ：Created in 2022/6/1 15:27
 * @description：测试Set
 */
public class TestSet {
    public static void main(String[] args) {

        /**
         * Set 没有顺序 不可重复
         * List 有顺序 可重复
         */


        Set<String> set01 = new HashSet<>();
        set01.add("aaa");
        set01.add("bbb");
        set01.add("ccc");

        set01.remove("bbb");

        System.out.println(set01);
    }
}

