package com.test;

import java.util.Scanner;

/**
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 */
public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int f=0;
        int[] a={x,y,z};
        //这不是冒泡，这是个啥排序方法，我这是写了个啥,但是排出来是对的
        for (int i=0;i<a.length;i++){
            for (int j=0;j<i;j++){
                if (a[i]<a[j]){
                    f = a[i];
                    a[i] = a[j];
                    a[j] = f;
                }

            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
