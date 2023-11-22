package com.itheima.demo;

public class Test2 {
    public static void main(String[] args) {
        //反转数组
        int[] arr = {10, 20, 30, 40, 50};

        for (int i= 0, j = arr.length-1; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for (int i: arr) {
            System.out.println(i);
        }
        System.out.println("----------------------");
        int[] arr1 = {10, 20, 30, 40, 50};
        for (int i = arr1.length-1; i < arr.length; i--) {
            if (i >= 0){
                System.out.println(arr1[i]);
            }
        }
    }
}
