package com.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，
 * 其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 */
public class Test08 {
    public static void main(String[] args) {
        /*System.out.print("输入相加的个数：");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.print("输入第一个加数：");
        int num = scanner.nextInt();
        //和
        int total = 0;

        for (int i=0;i<count;i++){
            //加数
            int addEnd=0;
            int jiashu=0;
            for (int j=0;j<=i;j++){
                //求加数
                addEnd=(int)(num*Math.pow(10,j));
                jiashu += addEnd;
            }
            System.out.print(jiashu+"+");
            total += jiashu;

        }
        System.out.print("="+total);*/


        /**
         * 使用数组
         */

    }
}
