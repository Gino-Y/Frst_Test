package com.itheima.define;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        //完成评委打分案例
        //定义动态数组
        double[] scores = new double[6];

        Scanner sc = new Scanner(System.in);

        //遍历数组每个位置录入评委的分数，存到数组中
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请您输入当前第" + (i + 1) + "个评委的分数");
            double score =  sc.nextDouble();
            scores[i] = score;
        }
        //遍历数组中每个元素进行加权平均
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }

        System.out.println("选手最终得分是：" + sum / scores.length);
    }
}
