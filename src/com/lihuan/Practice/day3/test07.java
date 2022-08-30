package com.lihuan.Practice.day3;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/12 16:02
 * @Description ：
 */
import java.util.Scanner;
public class test07 {
    public static void main(String[] args) {
        int abccount = 0;
        int spacecount = 0;
        int numcount = 0;
        int othercount = 0;
        Scanner input = new Scanner(System.in);
        String toString = input.nextLine();
        char[] ch = toString.toCharArray();

        for (char c : ch) {
            if (Character.isLetter(c)) {
                abccount++;
            } else if (Character.isDigit(c)) {
                numcount++;
            } else if (Character.isSpaceChar(c)) {
                spacecount++;
            } else {
                othercount++;
            }
        }
        System.out.println(abccount);
        System.out.println(spacecount);
        System.out.println(numcount);
        System.out.println(othercount);
    }

}
