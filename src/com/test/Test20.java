package com.test;

/**
 * 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 */
public class Test20 {
    public static void main(String[] args) {
        //设置2/1之前的分数值，为1/1
        int fenmu=1;
        int fenzi=1;
        double sum=0;
        for (int i=0;i<20;i++){
            int f=fenmu+fenzi;
            fenzi = fenmu;
            fenmu = f;
            System.out.println(fenmu+"/"+fenzi);
            sum+=fenmu/fenzi;
        }
        System.out.println(sum);

    }
}
