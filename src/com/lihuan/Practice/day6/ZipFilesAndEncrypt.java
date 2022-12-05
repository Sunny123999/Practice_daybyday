package com.lihuan.Practice.day6;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;
import org.apache.commons.lang3.StringUtils;
import java.io.File;
import java.util.ArrayList;

public class ZipFilesAndEncrypt {
    /**
     * @param srcFileName 待压缩文件路径
     * @param zipFileName zip文件名
     * @param password    加密密码
     * @return flag
     * @throws Exception
     * @Title: zipFilesAndEncrypt
     * @Description: 将指定路径下的文件压缩至指定zip文件，并以指定密码加密,若密码为空，则不进行加密保护
     */
    public void zipFilesAndEncrypt(String srcFileName, String zipFileName, String password) throws Exception {
        System.out.println("1.进入测试类");
        if (StringUtils.isEmpty(srcFileName)) {
            System.out.println("-----------------------------");
            System.out.println("请求的压缩路径有误！");
            return;
        }
        try {
            System.out.println("-----------------------------");
            System.out.println("2.压缩初始化");
            ZipParameters parameters = new ZipParameters();
            parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE); //压缩方式
            parameters.setSourceExternalStream(true);
            parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL); //压缩级别

            if (!StringUtils.isEmpty(password)) {
                System.out.println("-----------------------------");
                System.out.println("3.设置密码");
                parameters.setEncryptFiles(true);
                parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES); //加密方式
                parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
                parameters.setPassword(password.toCharArray()); //设置密码
                System.out.println("-----------------------------");
                System.out.println("4.密码设置成功");
            }
            ArrayList filesToAdd = new ArrayList();
            File file = new File(srcFileName);
            File[] files;
            if (file.isDirectory()) {
                files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    System.out.println("-----------------------------");
                    System.out.println("遍历目录内的文件");
                    filesToAdd.add(new File(srcFileName + files[i].getName()));
                    parameters.setFileNameInZip(files[i].getName());
                    System.out.println("(" + i + ")" + "." + "文件名称：" + files[i].getName());
                }
            } else {
                System.out.println("-----------------------------");
                filesToAdd.add(new File(srcFileName + file.getName()));
                parameters.setFileNameInZip(file.getName());
                System.out.println("5.添加压缩文件");
            }
            ZipFile zipFile = new ZipFile(srcFileName + ".zip");
            System.out.println("-----------------------------");
            System.out.println("6.新建压缩文件成功");
            //zipFile.addFolder(srcFileName,parameters);
            zipFile.addFiles(filesToAdd, parameters);
            System.out.println("-----------------------------");
            //zipFile.setFileNameCharset("gbk");
            System.out.println("7.文件压缩成功");
        } catch (Exception e) {
            System.out.println("-----------------------------");
            System.out.println("7.文件压缩出错");
            throw e;
        }
    }

    public static void main(String[] args) throws Exception {
        ZipFilesAndEncrypt zipFilesAndEncrypt = new ZipFilesAndEncrypt();
        zipFilesAndEncrypt.zipFilesAndEncrypt("E://测试//", "测试", "12345");
    }
}
