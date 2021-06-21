package com.test;

/**
 * 题目：求1+2!+3!+...+20!的和
 */
public class Test21 {
    public static void main(String[] args) {
        //加数初始化为1
        int a=1;
        //和初始化为0
        int s=0;
        for (int i=0;i<20;i++){
            a=a*(i+1);
            s=s+a;
            System.out.print(a+" ");
        }
        System.out.println("\n"+s);
    }
}
