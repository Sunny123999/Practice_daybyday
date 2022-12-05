package com.lihuan.Practice.ZipUtilsTest;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import java.io.File;
import java.io.IOException;

/**
 * 对指定目录下的文件压缩
 */
public class ZipUtils {

    public void Zip() throws ZipException, IOException {
        File path = new File("E:\\测试文件夹\\");
        File[] files = path.listFiles();

        for (int i = 0; i < files.length; i++) {
            ZipParameters zipParameters = new ZipParameters();
            System.out.println(files[i]);
            ZipFile zipFile = new ZipFile(files[i].getName() + "zip");
            zipFile.addFile(files[i], zipParameters);
        }
    }

    public static void main(String[] args) throws ZipException, IOException {
        ZipUtils zipUtils = new ZipUtils();
        zipUtils.Zip();
    }
}
