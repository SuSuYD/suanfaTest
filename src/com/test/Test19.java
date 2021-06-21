package com.test;

/**
 * 题目：打印出如下图案（菱形）
 *    *
 *   ***
 *  *****
 * *******
 *  *****
 *   ***
 *    *
 */
public class Test19 {
    public static void main(String[] args) {
        int h=7,w=7;
        for (int i=0;i<=h/2;i++){
            for (int j=0;j<w/2-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<i*2+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0;i<h/2;i++){
            for (int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<w-2*(i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
