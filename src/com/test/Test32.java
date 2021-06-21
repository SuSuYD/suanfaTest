package com.test;

import java.util.Scanner;

/**
 * 题目：取一个整数a从右端开始的4～7位。
 */
public class Test32 {
    public static void main(String[] args) {
        System.out.println("输入7位数以上的整数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        //将int转化为String
        String aToString = String.valueOf(a);
        //将String转化为字符数组
        char[] aChar = aToString.toCharArray();
        System.out.println("该正整数的4-7位是：");
        for (int i=(aChar.length-4);i>=(aChar.length-7);i--){
            System.out.print(aChar[i]);
        }
    }
}
