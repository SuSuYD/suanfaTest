package com.test;

/**
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半，再落下，
 * 求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Test10 {
    public static void main(String[] args) {
        double high = 100;
        double allHigh = 100;
        for (int i=0;i<10;i++){
            high = high/2;
            allHigh =allHigh+2*high;
        }
        System.out.println(high);
        System.out.println(allHigh);
    }
}
