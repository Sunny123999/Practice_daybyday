package com.briup.java.day9;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        File f = new File("gg.txt");
        f.createNewFile();
        System.out.println("TestFile.main");
    }
}
