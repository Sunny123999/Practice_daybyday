package com.lihuan.Practice.day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/17 9:49
 * @Description ：选择排序
 * 选择排序步骤：
 * 1.首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 * 2.再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾
 * 3.重复第二步，直到所有元素均排序完毕
 * 4.时间复杂度：O(n^2)
 * 5.空间复杂度：O(1)
 * 6.稳定性：不稳定
 * 7.优化：记录最小元素的索引，减少交换次数
 * 8.优化：如果某一趟排序中没有发生交换，说明已经有序，可以提前结束排序
 * 9.优化：记录最后一次交换的位置，作为下一次排序的边界，边界之后的元素已经有序
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

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//外层循环控制排序趟数
            int min = i;//记录最小元素的索引
            for (int j = i + 1; j < arr.length; j++) {//内层循环控制每一趟排序多少次
                if (arr[j] < arr[min]) {//找到最小元素的索引
                    min = j;//记录最小元素的索引
                }
            }
            if (min != i) {//如果最小元素的索引不是i，说明找到了最小元素，交换
                swap(arr, i, min);//交换
            }
        }
    }

    //完成数组两元素间交换
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
