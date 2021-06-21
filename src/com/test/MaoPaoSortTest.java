package com.test;

/**
 * 冒泡排序
 */
public class MaoPaoSortTest {
    public static void main(String[] args) {
        int[] a={4,6,2,50,3,1,33,22,15,87};
        for (int i=0;i<a.length-1;i++){//外层循环控制排序趟数
            for (int j=0;j<a.length-1-i;j++){//内层循环控制每一趟排序多少次
                if (a[j]>a[j+1]){
                    int m = a[j+1];
                    a[j+1] = a[j];
                    a[j] = m;
                }
            }
        }
        for (int k=0;k<a.length;k++){
            System.out.print(a[k]+"\t");
        }
    }
}
