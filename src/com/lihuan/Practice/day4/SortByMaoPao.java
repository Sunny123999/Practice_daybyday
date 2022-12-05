package com.lihuan.Practice.day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/17 9:25
 * @Description ：冒泡排序
 * 冒泡排序步骤：
 * 1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 3.针对所有的元素重复以上的步骤，除了最后一个。
 * 4.重复步骤1~3，直到排序完成。
 * 5.时间复杂度：O(n^2)
 * 6.空间复杂度：O(1)
 * 7.稳定性：稳定
 * 8.优化：如果某一趟排序中没有发生交换，说明已经有序，可以提前结束排序
 * 9.优化：记录最后一次交换的位置，作为下一次排序的边界，边界之后的元素已经有序
 */
public class SortByMaoPao {
    public static void main(String[] args) {
        //键盘接收字符串
        System.out.println("请输入一组数字，用“,”隔开，按回车结束：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().toString();
        System.out.println("排序前： ");
        String[] arr = str.split(",");
        //字符串转变为数字
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