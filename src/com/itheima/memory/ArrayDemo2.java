package com.itheima.memory;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //多变量指向同一个数组对象的形式
        int[] arr1 = {11, 22, 33};

        int[] arr2 = arr1;

        System.out.println(arr1);
        System.out.println(arr2);

        arr2[1] = 99;
        System.out.println(arr1[1]);
    }
}
