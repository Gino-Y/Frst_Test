package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //随即排名
        //定义动态初始化数组
        int[] codes = new int[5]; //[0, 0, 0, 0, 0]

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请您输入第" + (i + 1) + "位员工的工号：");
            int code = sc.nextInt();
            codes[i] = code;
        }
        //打乱数组中的元素顺序
        Random r = new Random(); // 产生随机数
        for (int i = 0; i < codes.length; i++) {

            //遍历到一个数据，都随机一个数组索引范围内的值。然后让当前遍历的数据与该索引位置处的值交换
            int index = r.nextInt(codes.length); // 0 - 4
            //定义一个临时变量记住index位置处的值
            int temp = codes[index];
            //把i位置处的值赋给index位置处
            codes[index] = codes[i];
            // 把index位置原来的值赋给i位置处
            codes[i] = temp;

        }

        //遍历输出即可
        for (int i : codes) {
            System.out.print(i + " ");
        }

    }
}
