package com.lihuan.Practice.GuessNumber;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ：sunny
 * @date ：Created in 2022/6/2 19:05
 * @description：读取配置文件
 */
public class PropertiesUtils {
    public static Properties properties = new Properties();

    static {
        try {
            properties.load(new FileInputStream("src/com/lihuan/Practice/GuessNumber/AddressPort.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
