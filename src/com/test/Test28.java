package com.test;

import java.util.Scanner;

/**
 *对10个数进行排序
 */
public class Test28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("输入10个数字：");
        for (int i=0;i<10;i++){
            a[i] = scanner.nextInt();
        }
        int[] b = maoPao(a);
        System.out.println("排序后结果：");
        for (int i = 0;i<b.length;i++){
            System.out.print(b[i]+"\t");
        }

    }
    public static int[] maoPao(int[] a){
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    int t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }
        }
        return a;
    }
}
