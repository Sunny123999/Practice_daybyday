package com.lihuan.Practice.day6;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/9/30 10:29
 * @Description ：直接排序
 */

import java.util.Arrays;
import java.util.Scanner;

public class DSort {

    public static void main(String[] args) {
        System.out.println("请输入一串数字，用“,”隔开，按回车结束：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().toString();
        String[] arr = str.split(",");
        int[] arrays = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
        System.out.println("排序前："+Arrays.toString(arrays));
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i; j < arrays.length; j++) {
                if (arrays[i] > arrays[j]) {//前一个数字与后一个数字比较小的在前大的在后
                    //交换位置
                    int temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        System.out.print("排序后：");
        System.out.println(Arrays.toString(arrays));
    }

}

