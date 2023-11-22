package com.itheima.method;

public class MethodDemo2 {
    //按照需求设计方法
    public static void main(String[] args) {
        printHelloWorld(3);
        System.out.println("----------------------");

        int[] arr = getRandomArray(20);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.println("----------------------");

        int min = getMin(arr);
        int min1 = getMin1(arr);
        int min2 = getMin2(arr);
        System.out.println(min  + "_0");
        System.out.println(min1 + "_1");
        System.out.println(min2 + "_2");
    }
    public static void printHelloWorld(int n){

        for (int i = 0; i < n; i++) {
            System.out.println("Hello World!" + (i+1));
        }
    }

    //求列表中最小值，使用标准函数库中的算法
    public static int getMin2(int[] arr){
        java.util.Arrays.sort(arr);
        return arr[0];
    }
    public static int getMin1(int[] arr){
        int min = arr[0];
        for (int i : arr) {
            min = i < min ? i : min;
        }
        return min;
    }
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i : arr) {
            if (i < min){
                min = i;
            }
        }
        return min;
    }
    //随机20个不重复的整数元在数组中的方法
    public static int[] getRandomArray(int n){
        int[] arr = new int[n];
        int count = 0;
        while (count < n){
            int num = (int)(Math.random() * 100 + 1);
            boolean flag = true;
            for (int i : arr) {
                if (i == num){
                    flag = false;
                    break;
                }
            }
            if (flag){
                arr[count] = num;
                count++;
            }
        }
        return arr;
    }
}
