package com.itheima.memory;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //掌握普通变量和数组，原理和执行过程
        int a = 20;
        System.out.println(a);

        int [] arr = new int[]{11, 22, 33};
        System.out.println(arr);

        System.out.println(arr[1]);

        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 66;

        for(int i : arr){
            System.out.println(i);
        }
    }
}
