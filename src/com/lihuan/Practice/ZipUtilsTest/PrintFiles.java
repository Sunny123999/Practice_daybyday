package com.lihuan.Practice.ZipUtilsTest;

import java.io.File;
import java.util.Scanner;
/**
 * 输出指定目录下的文件
 */
public class PrintFiles {
    public void PrintFiles() {
        System.out.println("请输入要查找的目录路径:");
        Scanner scanner = new Scanner(System.in);
        String srcpath = scanner.nextLine().toString();
        File path = new File(srcpath);
        File[] files = path.listFiles();
        int total = files.length;
        System.out.println("*******************开始查找*******************");
        System.out.println("文件总数:" + total);
        for (int i = 0; i < files.length; i++) {
            System.out.println("输出" + path + "目录下的文件:" + files[i].getName());
        }
    }

    public static void main(String[] args) {
        PrintFiles printFiles = new PrintFiles();
        printFiles.PrintFiles();
    }
}
