package com.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 */
public class Test30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入10个数字：");
        int[] a=new int[10];
        //输入最初的数组
        for (int i=0;i<10;i++){
            a[i] = scanner.nextInt();
        }
        //对数组按升序排序
        Arrays.sort(a);
        //输出排序后数组
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        //再输入一个数字
        System.out.print("\n再输入一个数字：");
        int b = scanner.nextInt();
        //输入数字后排序结果
        int[] c = paiXu(a,b);
        for (int i=0;i<c.length;i++){
            System.out.print(c[i]+"\t");
        }

    }
    public static int[] paiXu(int[] a,int b){
        int[] c = new int[a.length+1];
        for (int i=0;i<a.length;i++){
            if (a[i]<b){
                c[i]=a[i];
                //b大于数组中最后一个数时，b排在数组最后面
                if (a[a.length-1]<b){
                    c[i+1]=b;
                }
            }else {
                c[i]=b;
                //b放入数组c后，将a中其他数copy到c中
                System.arraycopy(a,i,c,i+1,a.length-i);
                break;
            }
        }
        return c;
    }

}
