package com.lihuan.Practice.ZipUtilsTest;

import java.io.IOException;
import com.jxcell.CellException;
import com.jxcell.View;

/**
 * excel加密、解密 代码
 */
public class EncryptDecryptUtil {

    /**
     * 读取excel，并进行加密
     *
     * @param url
     *            excel文件路径 例：D:\\word.xls
     * @param pwd
     *            加密密码
     */
    public static void encrypt(String url, String pwd) {
        View m_view = new View();
        try {
            // read excel
            m_view.read(url);
            // set the workbook open password
            m_view.write(url, pwd);
        } catch (CellException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String args[]) {
        //1. 把g:\\test.xls 添加打开密码123
        EncryptDecryptUtil.encrypt("e:\\test.xlsx", "123");


    }
}
