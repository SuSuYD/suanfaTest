package com.test;

import java.util.Scanner;

/**
 * 题目：将一个数组逆序输出。
 */
public class Test31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一串数字：");
        int[] a = new int[10];
        /*int i=0;
        do {
            a[i] = scanner.nextInt();
            i++;
        }while (i<10);
        System.out.println("输入的数组：");
        for (int j=0;j<a.length;j++){
            System.out.print(a[j]+"\t");
        }*/
        //键入和输出数组
        for (int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
            System.out.print(a[i]+"\t");
        }
        System.out.println("\n逆序输出数组：");
        for (int k=a.length-1;k>=0;k--){
            System.out.print(a[k]+"\t");
        }
    }
}
