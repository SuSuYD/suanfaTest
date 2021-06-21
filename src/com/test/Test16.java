package com.test;

/**
 * 题目：输出9*9口诀。
 */
public class Test16 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                sum=i*j;
                System.out.print(j+"*"+i+"="+sum+"\t");
            }
            System.out.println("\t");
        }
    }

}
