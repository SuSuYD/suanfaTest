package com.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 * 题目：输入3个数a,b,c，按大小顺序输出。
 */
public class Test34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入a,b,c三个数字：");
        //以数组形式保存a,b,c
        int[] a = new int[3];
        for (int i=0;i<a.length;i++){
            a[i] = scanner.nextInt();
        }
        //冒泡排序
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j] > a[j+1]) {
                    int t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }
        }
        //输出排序后
        System.out.print("排序后：");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }

    }

}
