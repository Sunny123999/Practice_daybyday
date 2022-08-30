package com.lihuan.Practice.day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/17 9:49
 * @Description ：选择排序
 */

public class SelectSort {
    public static void main(String[] args) {
        //模拟数据
        System.out.println("请输入一组数据，用“,”隔开 ：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().toString();
        String[] split = s.split(",");
        int[] array = Arrays.asList(split).stream().mapToInt(Integer::parseInt).toArray();
        System.out.println("原数组：");
        System.out.print(Arrays.toString(array));
        System.out.println();
        selectSort(array);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(array));
    }

    public static void selectSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j <arr.length ;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                swap(arr, i, min);
            }
        }
    }
    //完成数组两元素间交换
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
