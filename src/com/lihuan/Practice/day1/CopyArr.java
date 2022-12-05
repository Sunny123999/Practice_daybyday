package com.lihuan.Practice.day1;

import java.util.Arrays;

/**
 * @Description: 数组拷贝
 * 将一个数组的指定索引元素拷贝到另一个数组的指定索引位置
 */
public class CopyArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("拷贝前：" + Arrays.toString(arr1));
        System.arraycopy(arr, 2, arr1, 3, 3);
        System.out.println("拷贝后："+Arrays.toString(arr1));
    }
}
