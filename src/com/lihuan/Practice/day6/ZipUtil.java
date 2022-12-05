package com.lihuan.Practice.day6;

import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.ZipFile;

public class ZipUtil{
    public static void main(String[] args) throws IOException {
        String sss="五千年的风和雨啊创了多少梦\r\nahhwdpjfwjfpwjpf\r\n19eu923ur932ur03";
        String passwd="111#";
        ZipParameters parameters = new ZipParameters();
        parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);           // 压缩方式
        parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);    // 压缩级别
        parameters.setSourceExternalStream(true);
        parameters.setFileNameInZip("aaaa.txt");
        if (!"".equals(passwd)) {
            parameters.setEncryptFiles(true);
            parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD); // 加密方式
            parameters.setPassword(passwd.toCharArray());
        }
            ZipFile zipFile = new ZipFile("D:\\java压缩文件.zip");
            //zipFile.addStream(new ByteArrayInputStream(sss.getBytes()), parameters);
    }
}
