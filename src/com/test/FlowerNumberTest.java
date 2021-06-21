package com.test;

/**
 * 题目：打印出所有的 "水仙花数 "，
 * 所谓 "水仙花数 "是指一个三位数，
 * 其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153 = 1的三次方＋5的三次方＋3的三次方。
 */
public class FlowerNumberTest {
    public static void main(String[] args) {
        int handred,ten,num;
        double flowerNum;
        System.out.println("水仙花数有：");
        for (int i=152;i<=999;i++){
            //得到百位、十位、个位
            handred = i/100;//百位
            ten = i/10%10;//十位
            num = i%10;//个位
            //计算百位、十位、个位的三次方幂的和
            flowerNum = Math.pow(handred,3)+Math.pow(ten,3)+Math.pow(num,3);
            if (i==flowerNum){
                System.out.print("分解"+handred+"\t"+ten+"\t"+num+"\t\n");
                System.out.println(i);
            }
        }
    }


}
