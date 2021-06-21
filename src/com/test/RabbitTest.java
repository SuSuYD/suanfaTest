package com.test;

import java.util.Scanner;

/**
 * 题目：古典问题：
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少？
 */
public class RabbitTest {
    public static void main(String[] args) {
        /*int f1=1,f2=1,f;
        int M=30;
        System.out.println(f1);
        System.out.println(f2);
        for(int i=3;i<M;i++) {
            f=f2;
            f2=f1+f2;
            f1=f;
            System.out.println(f2);
        }*/

        System.out.print("查询前几个月的兔子数：");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int[] arr = new int[month];

        for (int i=0;i<month;i++){
            if (i<2){
                arr[i] = 1;
            }else {
                arr[i] = arr[i-2]+arr[i-1];
            }
            int m=i+1;
            System.out.println("第"+m+"个月："+arr[i]+"只兔子");
        }

        System.out.print("查询其中一个月的兔子数：");
        int num = sc.nextInt();
        if (num <= month){
            System.out.println("第"+num+"个月的兔子数为："+arr[num-1]);
        }else {
            System.out.println("请先查询出这个月的兔子数");
        }

    }
}
