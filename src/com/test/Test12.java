package com.test;

import java.util.Scanner;

/**
 * 题目：企业发放的奖金根据利润提成。
 * 利润(I)低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；
 * 40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%；
 * 高于100万元时，超过100万元的部分按1%提成，
 * 从键盘输入当月利润，求应发放奖金总数？   
 */
public class Test12 {
    public static void main(String[] args) {
        System.out.print("输入当月利润：");
        Scanner scanner = new Scanner(System.in);
        double i = scanner.nextDouble();
        double bouns=0;
        if (i<=10){
            bouns = i*0.1;
        }else if (i>=10&&i<=20){
            bouns = 10*0.1+(i-10)*0.075;
        }else if (i>=20&&i<=40){
            bouns = 10*0.1+(20-10)*0.075+(i-20)*0.05;
        }else if (i>=40&&i<=60){
            bouns = 10*0.1+(20-10)*0.075+(40-20)*0.05+(i-40)*0.03;
        }else if (i>=60&&i<=100){
            bouns = 10*0.1+(20-10)*0.075+(40-20)*0.05+(60-40)*0.03+(i-60)*0.015;
        }else {
            bouns = 10*0.1+(20-10)*0.075+(40-20)*0.05+(60-40)*0.03+(100-60)*0.015+(i-100)*0.01;
        }
        System.out.println(bouns);
    }
}
