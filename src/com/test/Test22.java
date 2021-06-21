package com.test;

/**
 * 题目：利用递归方法求5!。
 */
public class Test22 {
    public static void main(String[] args) {
        System.out.println("5! = "+fac(5));
    }
    public static int fac(int i){
        if (i==1){
            return i;
        }else {
            return i*fac(i-1);
        }
    }
}
