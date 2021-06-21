package com.test;

import java.util.Scanner;

/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 求最大公约数方法：大数除小数取余，再用小数除余数取余，余数为0时除数为最大公约数
 * 最小公倍数=两数乘积/最大公约数
 */
public class MaxAndMinCommonMultiple {
    public static void main(String[] args) {
        System.out.print("输入两个正整数m和n：");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int f = m*n;
        int max,min;
        //使用冒泡排序时m>n
        if (m<n){
            int t;
            t=n;
            n=m;
            m=t;
        }
        //求最大公约数
        while (n!=0){
            int a=n;
            n=m%n;
            m=a;
        }
        //m为m%n=0时的除数
        max=m;
        min=f/max;
        System.out.println("最大公约数："+max);
        System.out.println("最小公倍数："+min);

    }

    /*Scanner input =new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    MaxAndMinCommonMultiple test=new MaxAndMinCommonMultiple();
    int i = test.gongyinshu(a, b);
        System.out.println("最小公因数"+i);
        System.out.println("最大公倍数"+a*b/i);
}
    public int gongyinshu(int a,int b) {
        if(a<b) {
            int t=b;
            b=a;
            a=t;
        }
        while(b!=0) {
            if(a==b)
                return a;
            int x=b;
            b=a%b;
            a=x;
        }
        return a;
    }
*/
}
