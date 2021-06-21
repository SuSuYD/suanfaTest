package com.test;

/**
 * 题目：求100之内的素数
 * 除了1和本身没有其他因数
 */
public class Test27 {
    public static void main(String[] args) {
        boolean b = true;
        //2是素数
        System.out.println(2);
        //从3开始找，除从2开始到小于被除数的数，都有余数就是素数
        for (int i=3;i<=100;i++){
            for (int j=2;j<i;j++){
                if (i%j==0){
                    //System.out.println(i+"不是素数");
                    b=false;
                    break;
                }else {
                    b=true;
                }
            }
            if (b==true){
                System.out.print(i+"\t");
            }
        }
    }
}
