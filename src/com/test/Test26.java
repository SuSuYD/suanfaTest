package com.test;

import java.util.Scanner;

/**
 * 题目：请输入星期几的第一个字母来判断一下是星期几，
 * 如果第一个字母一样，则继续   判断第二个字母。
 * Sunday   星期日
 * Monday   星期一
 * Tuesday   星期二
 * Wednesday   星期三
 * Thursday    星期四
 * Friday      星期五
 * Saturday    星期六
 */
public class Test26 {
    public static void main(String[] args) {
        getChar tw = new getChar();
        System.out.print("输入星期的第一个大写字母：");
        char ch = tw.getChar();
        switch (ch){
            case 'M':
                System.out.println("星期一");
                break;
            case 'F':
                System.out.println("星期五");
                break;
            case 'W':
                System.out.println("星期三");
                break;
            case 'S':
                System.out.print("请输入第二个大写字母");
                char ch2 = tw.getChar();
                if (ch2=='U'){
                    System.out.println("星期日");
                }else if (ch2=='A'){
                    System.out.println("星期六");
                }else {
                    System.out.println("无此写法！");
                }
                break;
            case 'T':
                System.out.print("输入第二个大写字母：");
                char ch3 = tw.getChar();
                if (ch3=='U'){
                    System.out.println("星期二");
                }else if (ch3=='H'){
                    System.out.println("星期四");
                }else {
                    System.out.println("无此写法！");
                }
                break;
            default:
                System.out.println("无此写法！");
        }
    }
}
class getChar{
    //以字符的形式输入
    public char getChar(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch = str.charAt(0);
        if (ch<'A' || ch>'Z'){
            System.out.println("输入错误，请重新输入");

        }
        return ch;
    }
}
