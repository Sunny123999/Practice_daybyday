package com.lihuan.Practice.day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/17 9:25
 * @Description ：冒泡排序
 */
public class SortByMaoPao {
    public static void main(String[] args) {
        //键盘接收字符串
        System.out.println("请输入一组数字，用“,”隔开，按回车结束：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().toString();
        System.out.println("排序前： ");
        String[] arr = str.split(",");
        //字符串转变为数字数字
        int[] numbers = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(numbers));
        //冒泡比较
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                int temp = 0;
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后： ");
        System.out.println(Arrays.toString(numbers));
    }
}