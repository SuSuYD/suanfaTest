package com.test;

/**
 * 题目：判断101-200之间有多少个素数，并输出所有素数。
 * 程序分析：判断素数的方法：
 * 用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。
 * sqrt  得到这个数的算术平方根的函数
 */
public class PrimeNumberTest {
    public static void main(String[] args) {
        int count = 0;
        for (int num = 101;num<=200;num++){
            //使用 boolean函数作为判断是否为素数的标准
            boolean flag = false;
            for (int j=2;j<=Math.sqrt(num);j++){

                if (num%j == 0){
                    flag=false;
                    //只要有一个可以整除就跳出 j 循环
                    break;
                }else{
                    flag = true;
                }
            }
            if (flag==true){
                count++;
                System.out.print(num+" ");
            }
        }
        System.out.println("\n"+"素数个数为："+count);
    }
}
