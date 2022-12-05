package com.lihuan.Practice.day6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 实现一个软件只能试用10次，超过10次后提醒用户购买软件
 */
public class UserProduct {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("C:\\Users\\sunny\\Desktop\\来电名片-共享版省直发展日报详情---查询sql.sql");
            char[] buf = new char[10];
            int len = in.read(buf);
            int times = Integer.valueOf(new String(buf,0,len));             //字符串转int
            if (times > 0) {
                System.out.println("您还有" + times + "次机会使用该软件！");
                times--;
                out = new FileWriter("C:\\Users\\sunny\\Desktop\\来电名片-共享版省直发展日报详情---查询sql.txt");
                out.write(times + "");
                out.flush();
            }else {
                System.out.println("您的试用次数已到，请购买软件！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null){
                    in.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                if (out != null){
                    out.close();
                }
                }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


}
