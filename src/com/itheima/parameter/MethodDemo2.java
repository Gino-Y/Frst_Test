package com.itheima.parameter;

public class MethodDemo2 {
    public static void main(String[] args) {
        //理解方法引用类型的参数传递机制：地址引用传递
        int[] arr = {10, 20, 30};
        change(arr);
        System.out.println("main:" + arr[1]);
    }

    public static void change(int[] arr){
        System.out.println(arr[1]);
        arr[1] = 222;
        System.out.println(arr[1]);
    }
}
