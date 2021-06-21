package com.test;

import java.util.Scanner;

/**
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */
public class Test07 {
    public static void main(String[] args) {
        //初始化英文字母数、空格数、数字数、其他字母数
        int abcCount = 0;
        int spaceCount = 0;
        int numCount = 0;
        int otherCount = 0;
        System.out.println("输入一串字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //将字符串转化为字符数组
        char[] ch = str.toCharArray();

        for (int i=0;i<ch.length;i++){
            //判断字符是否为字母
            if (Character.isLetter(ch[i])){
                abcCount++;
            }else if (Character.isSpaceChar(ch[i])){
                //判断是否为空格
                spaceCount++;
            }else if (Character.isDigit(ch[i])){
                //判断是否为数字
                numCount++;
            }else {
                otherCount++;
            }

        }
        System.out.println("字母个数："+abcCount);
        System.out.println("空格个数："+spaceCount);
        System.out.println("数字个数："+numCount);
        System.out.println("其他字符个数："+otherCount);


    }
}
