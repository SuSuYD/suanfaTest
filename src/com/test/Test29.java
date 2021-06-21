package com.test;

import java.util.Scanner;

/**
 * 求一个3*3矩阵对角线元素之和
 */
public class Test29 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        System.out.println("输入矩阵数：");
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                a[i][j] = scanner.nextInt();
            }
        }
        int s=sum(a);
        System.out.println("\n对角线数字和为："+s);
    }
    public static int sum(int[][] a){
        int sum=0;
        System.out.print("对角线上的数是：");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if (i==j){
                    System.out.print(a[i][j]+"\t");
                    sum+=a[i][j];
                }
            }
        }
        return sum;
    }
}
