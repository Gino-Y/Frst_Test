package com.itheima.define;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //动态初始化数组
        int[] ages = new int[3];
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        ages[0] = 12;
        ages[1] = 24;
        ages[2] = 32;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);


        int[] arr = {1, 2, 3};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
