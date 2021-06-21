package com.test;

/**
 * 题目：有1、2、3、4四个数字，能组成多少个互不相同且一个数字中无重复数字的三位数？并把他们都输入。
 */
public class Test11 {
    public static void main(String[] args) {
        int count=0;
        int[] a = {1,2,3,4};
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                for (int k=0;k<4;k++){
                    if (i!=j && i!=k && j!=k){
                        count++;
                        System.out.println(a[i]*100+a[j]*10+a[k]);
                    }
                }
            }
        }
        System.out.println("有"+count+"个数字");
    }
}
