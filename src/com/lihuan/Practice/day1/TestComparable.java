package com.lihuan.Practice.day1;

import java.util.Arrays;

/**
 * @author ：sunny
 * @date ：Created in 2022/5/26 14:34
 * @description：冒泡排序
 * @modified By：
 * @version: $
 */
public class TestComparable {

    public static void main(String[] args) {
        int[] values = { 3, 1, 6, 2, 9, 0, 7, 4, 5, 8 };
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
    }

    public static void bubbleSort(int[] values) {
        int temp;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }
}
