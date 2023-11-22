package com.itheima.demo;

public class Test1 {
    public static void main(String[] args) {
        //数组元素求最值
        //获取元素数据
        int[] faceScores = {15, 9000, 10000, 20000, 9500, -5};
        //对比
        int max = 0;
        //留下需要的数据

        for(int i: faceScores){
            if (i >= max){
                max = i;
            }
        }
        System.out.println(max);

        System.out.println("----------------------");
        int max1 = 0;
        for(int i : faceScores){
//            max1 = Math.max(max1, i);
            max1 = max1 >= i ? max1 : i;
        }
        System.out.println(max1);

    }
}
