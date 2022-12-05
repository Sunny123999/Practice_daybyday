package com.lihuan.Practice.day1;

/**
 * @Description: 快速查找
 */

public class sendMsg {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};            //定义一个数组
        int index = getIndex(arr, 5);                 //调用方法
        System.out.println(index);                          //输出结果
    }

    public static int getIndex(int[] arr, int value) {      //定义一个方法
        int min = 0;                                        //定义最小值
        int max = arr.length - 1;                           //定义最大值
        int mid = (min + max) / 2;                          //定义中间值
        while (arr[mid] != value) {                         //当中间值不等于要查找的值时
            if (arr[mid] > value) {                         //当中间值大于要查找的值时
                max = mid - 1;                              //最大值等于中间值减一
            } else {
                min = mid + 1;                              //最小值等于中间值加一
            }
            if (min > max) {                                //当最小值大于最大值时
                return -1;                                  //返回-1
            }
            mid = (min + max) / 2;                          //中间值等于最小值加最大值除以2
        }
        return mid;                                         //返回中间值
    }
}