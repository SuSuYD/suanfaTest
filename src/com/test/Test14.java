package com.test;

import java.util.Scanner;

/**
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 */
public class Test14 {
    public static void main(String[] args) {
        int daysForMonth=0;
        int totalDays=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入年：");
        int year = scanner.nextInt();
        if (year<=0){
            System.out.println("输入有误！");
        }
        System.out.print("输入月：");
        int month = scanner.nextInt();
        if (month<=0||month>12){
            System.out.println("输入有误！");
        }
        System.out.print("输入日：");
        int day = scanner.nextInt();
        if (day<=0||day>31){
            System.out.println("输入有误");
        }
        for (int i=1;i<=month;i++){
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysForMonth=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysForMonth=30;
                    break;
                case 2:
                    if (year%4==0||(year/100!=0 && year/400==0)){
                        daysForMonth=29;
                    }else {
                        daysForMonth=28;
                    }
                    break;
            }
            totalDays += daysForMonth;
        }
        System.out.println(totalDays+day);
    }
}
