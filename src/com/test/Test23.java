package com.test;

/**
 * 题目：有5个人坐在一起，
 * 问第五个人多少岁？他说比第4个人大2岁。
 * 问第4个人岁数，他说比第3个人大2岁。
 * 问第三个人，又说比第2人大两岁。
 * 问第2个人，说比第一个人大两岁。
 * 最后问第一个人，他说是10岁。
 * 请问第五个人多大？
 */
public class Test23 {
    public static void main(String[] args) {
        //第一个人10岁
        int p=10;
        //每个人比前一个人大两岁
        for (int i=1;i<5;i++){
            p+=2;
        }
        System.out.println("第五人"+p+"岁");
    }
}
