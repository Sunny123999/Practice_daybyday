package com.lihuan.Practice.day3;

import javax.security.auth.login.FailedLoginException;
import java.util.Scanner;

/**
 * @author ：sunny
 * @date ：Created in 2022/5/17 15:44
 * @description：手机号码脱敏工具类
 * @modified By：2022/11/18 10:14
 * @version: $1.1$
 */
public class DataDesensitizedUtils {

    public static String desensitizedPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && !("".equals(phoneNumber))) {
            phoneNumber = phoneNumber.replaceAll("(\\w{3})\\w*(\\w{4})", "$1****$2");
        }
        return phoneNumber;
    }

    public static void main(String[] args) throws FailedLoginException {
        System.out.println("输入电话号码:");
        Boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            String phone = scanner.next();
            char[] b = phone.toCharArray();
            if (phone.length() != 11) {
                System.out.println("输入的电话号码不是11位,请重新输入:");
            } else if (b[0] != '1') {
                System.out.println("输入的电话号码不是以1开头,请重新输入:");
            } else if (b[1] < '3' || b[1] > '9') {
                System.out.println("第二位数字不对，请重新输入");
            } else if (phone.matches(".*[a-zA-Z]+.*")) {//判断输入的不是数字
                System.out.println("输入的电话号码不是数字,请重新输入:");
            } else {
                System.out.println("输入的电话号码是:" + phone);
                System.out.println("脱敏后的电话号码是:" + desensitizedPhoneNumber(phone));
                flag = false;
            }

        }
    }
}




