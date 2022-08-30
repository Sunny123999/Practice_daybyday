package com.briup.java.day9;

import java.io.File;
import java.io.FileReader;

/**
 * @author ：sunny
 * @date ：Created in 2022/5/27 15:32
 * @description：
 * @modified By：
 * @version: $
 */
public class TestException {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("E:/Practice_daybyday/gg.txt");{
                char c1 = (char) reader.read();
                char c2 = (char) reader.read();
                char c3 = (char) reader.read();
                System.out.println(c1+c2+c3);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
