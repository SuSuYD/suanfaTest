package com.test;

/**
 * 题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 */
public class Test13 {
    public static void main(String[] args) {
        double a,b;
        for (int i=0;i<100000;i++){
            a=Math.sqrt(i+100);
            b=Math.sqrt(i+100+168);
            if (a==(int)a && b==(int)b){
                System.out.println(i);
            }
        }
    }
}
