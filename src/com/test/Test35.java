package com.test;

import java.util.Scanner;

/**
 * 题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 */
public class Test35 {
    public static void main(String[] args) {
        System.out.println("输入5位数组：");
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        //输入数组
        for (int i=0;i<a.length;i++){
            a[i] = scanner.nextInt();
            System.out.print(a[i]+"\t");
        }
        //找出最大的数
        int maxi=0;
        int max = a[maxi];
        for (int i=0;i<a.length;i++){
            if (max<a[i]){
                max=a[i];
                maxi=i;
            }

        }
        //最大的数和第一个元素换位置
        int t=a[0];
        a[0]=a[maxi];
        a[maxi]=t;
        //找出最小的数
        int mini=0;
        int min = a[mini];
        for (int i=0;i<a.length;i++){
            if (min>a[i]){
                min=a[i];
                mini=i;
            }
        }
        //最小数和最后一个元素交换
        int m = a[a.length-1];
        a[a.length-1]=a[mini];
        a[mini] = m;

        //输出换位后数组
        System.out.println("\n换位后数组：");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }

    }
}
