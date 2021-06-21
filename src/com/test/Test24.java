package com.test;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;
import java.util.SplittableRandom;

/**
 *题目：给一个不多于5位的正整数，要求：
 * 一、求它是几位数，二、逆序打印出各位数字。
 */
public class Test24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个不多于5位的正整数：");
        //以字符串形式输入
        String toString = scanner.nextLine();
        //将字符串转换为数组
        char[] num = toString.toCharArray();
        System.out.println("数字有"+num.length+"位");
        for (int i=num.length;i>0;i--){
            System.out.print(num[i-1]+"\t");
        }


    }
}
