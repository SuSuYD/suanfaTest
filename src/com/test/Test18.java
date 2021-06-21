package com.test;

import java.util.SplittableRandom;

/**
 * 题目：两个乒乓球队进行比赛，各出三人。
 * 甲队为a,b,c三人，乙队为x,y,z三人。
 * 已抽签决定比赛名单。有人向队员打听比赛的名单。
 * a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
 */
public class Test18 {
    public static void main(String[] args) {
        //新建两个数组，存放两队的队员
        String[] a={"a","b","c"};
        String[] b={"x","y","z"};
        //i,j,k三个for循环，分别代表和a,b,c对打的对手，根据if条件给他们分配对手
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b.length;j++){
                if (b[i]!=b[j]){//避免参赛人相同
                    for (int k=0;k<b.length;k++){
                        if (b[i]!=b[k]&&b[j]!=b[k]){//避免参赛人相同
                            if (b[i]!="x" && b[k]!="x" && b[k]!="z"){
                                System.out.println(a[0]+":"+b[i]);
                                System.out.println(a[1]+":"+b[j]);
                                System.out.println(a[2]+":"+b[k]);
                            }
                        }
                    }
                }
            }
        }
    }
}
