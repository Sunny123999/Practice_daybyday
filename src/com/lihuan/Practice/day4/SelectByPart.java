package com.lihuan.Practice.day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/17 10:09
 * @Description ：二分查找
 * 二分查找步骤：
 * 1.首先确定该数组的中间下标 mid = (left + right) / 2
 * 2.然后让需要查找的数 findVal 和 arr[mid] 比较
 * 2.1 findVal > arr[mid]，说明你要查找的数在 mid 右边，因此需要递归向右查找
 * 2.2 findVal < arr[mid]，说明你要查找的数在 mid 左边，因此需要递归向左查找
 * 2.3 findVal == arr[mid]，说明找到，就返回
 * 3.当 left > right 时，说明递归整个数组，但是没有找到，就返回 -1
 * 4.时间复杂度：O(log2n)
 * 5.空间复杂度：O(1)
 * 6.稳定性：不稳定
 * 7.优化：当数组有序时，可以使用二分查找
 * 8.注意：二分查找的前提是该数组是有序的
 */
public class SelectByPart {
    public static void main(String[] args) {
        System.out.println("请输入一组数据，用“,”隔开 ：");
        Scanner scanner = new Scanner(System.in);// 创建一个扫描器对象
        String s = scanner.next().toString();// 读取一行数据
        String[] split = s.split(",");// 将数据分割成数组
        int[] arr = Arrays.asList(split).stream().mapToInt(Integer::parseInt).toArray();// 将数组转换成int类型
        //判断数组是否有序
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        //排序
        if (!flag) {
            Arrays.sort(arr);
        }
        System.out.println("请输入要查找的数字： ");
        int key = scanner.nextInt();// 读取要查找的数字

        //int position = recursionBinarySearch(arr,key,0,arr.length - 1);
        int position = commonBinarySearch(arr, key);
        if (position == -1) {
            System.out.println("查找的是" + key + ",序列中没有该数！");
        } else {
            System.out.println("查找的是" + key + ",找到位置为：" + position);
        }

    }

    /**
     * 使用递归的二分查找
     * title:recursionBinarySearch
     *
     * @param arr 有序数组
     * @param key 待查找关键字
     * @return 找到的位置
     */
    public static int recursionBinarySearch(int[] arr, int key, int low, int high) {

        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }

        int middle = (low + high) / 2;            //初始中间位置
        if (arr[middle] > key) {
            //比关键字大则关键字在左区域
            return recursionBinarySearch(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            //比关键字小则关键字在右区域
            return recursionBinarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }

    }

    /**
     * 不使用递归的二分查找
     * title:commonBinarySearch
     *
     * @return 关键字位置
     */
    public static int commonBinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int middle = 0;            //定义middle

        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }

        while (low <= high) {
            middle = (low + high) / 2;//初始中间位置
            if (arr[middle] > key) {
                //比关键字大则关键字在左区域
                high = middle - 1;//最高位调整到中间位左边一位
            } else if (arr[middle] < key) {
                //比关键字小则关键字在右区域
                low = middle + 1;//最低位调整到中间位右边一位
            } else {
                return middle;//找到位置
            }
        }
        return -1;        //最后仍然没有找到，则返回-1
    }

}
