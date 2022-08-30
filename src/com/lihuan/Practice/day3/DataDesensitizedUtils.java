package com.lihuan.Practice.day3;

import javax.security.auth.login.FailedLoginException;
import java.util.Scanner;

public class DataDesensitizedUtils {

	public static String desensitizedPhoneNumber(String phoneNumber) {

	 if (phoneNumber!=null&&!("".equals(phoneNumber))) {
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

				if (phone.length() == 11) {
					System.out.println("号码脱敏后:"+desensitizedPhoneNumber(phone));
					flag = false;
				} else if (phone.length() != 11) {
					System.out.println("号码长度不正确，请重新输入");
//				} else if (b[i]<'0'||b[i]>'9') {
//					System.out.println("输入的不是数字，请重新输入");
//				}else if (b[0]!='1'){
//					System.out.println("开头不为1，请重新输入");
//				}else if (b[1]<'3'||b[1]>'9'){
//					System.out.println("第二位数字不对，请重新输入");
//				}
				}

			}
		}
	}
