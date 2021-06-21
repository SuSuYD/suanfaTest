package com.test;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 题目：利用条件运算符的嵌套来完成此题：
 * 学习成绩> =90分的同学用A表示，
 * 60-89分之间的用B表示，
 * 60分以下的用C表示
 */
public class ConditionalOperatorTest {
    public static void main(String[] args) {
        System.out.print("输入成绩：");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        //如果分数大于等于90成立为A，否则为B或C
        //如果在60~89之间为B，否则为C
        String grade = (score>=90)? "A" :(score>=60&&score<=89)? "B" : "C";
        System.out.println("等级为："+grade);
    }
}
