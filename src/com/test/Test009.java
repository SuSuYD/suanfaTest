package com.test;

/**
 * 题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程     找出1000以内的所有完数。
 */
public class Test009 {
    public static void main(String[] args) {

        for (int i=1;i<=1000;i++){
            int yinshu=0;
            for (int j=i;j>1;j--){
                if (i%j==0){
                    yinshu+=i/j;
                }
            }
            if (i==yinshu){
                System.out.println("完整数有："+i+" ");
            }


        }
    }
}
