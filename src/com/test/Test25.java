package com.test;

import java.util.Scanner;

/**
 * 题目：一个5位数，判断它是不是回文数。
 * 即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class Test25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个五位数：");
        String toString = scanner.nextLine();

        if (toString.length()!=5){
            System.out.println("输入错误，重新输入！");
        }
        while (toString.length()==5){
            char[] num=toString.toCharArray();
            if (num[0]==num[4] && num[1]==num[3]){
                System.out.println("这是一个回文数");
            }else {
                System.out.println("不是回文数");
            }
        }

    }
}
