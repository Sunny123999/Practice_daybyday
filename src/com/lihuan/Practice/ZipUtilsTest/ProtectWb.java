package com.lihuan.Practice.ZipUtilsTest;

import com.spire.xls.*;
import java.io.File;
/**
 * 对Excel文件加密
 */
public class ProtectWb {
    public static void main(String[] args) {
        //文件路径
        File dir = new File("E:/测试/");
        System.out.println("当前文件夹路径： " + dir);
        System.out.println("------------------------------");
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.print("遍历当前文件夹的Excel文件：");
            System.out.println(files[i].getName());
            //加载测试文档
            Workbook wb = new Workbook();
            wb.loadFromFile(dir + "/" + files[i].getName());
            //使用密码加密文档
            wb.protect("12345");
            System.out.println("Excel文件加密成功！");
            //保存文档
            wb.saveToFile(dir + "/" + "加密后" + files[i].getName(), ExcelVersion.Version2010);
            System.out.print("加密后的文件路径: ");
            System.out.println(wb.getFileName());
            System.out.println("------------------------------");
            wb.dispose();
        }
    }
}
