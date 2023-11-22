package com.itheima.parameter;

public class MethodTest3 {
    public static void main(String[] args) {
        //打印int类型的数组的元素
        //格式为[1, 2, 3, 4, 5]
        int[] arr = {10, 20, 30, 40, 50};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //三目运算符方式实现
            // 如果当前索引 i 是数组的最后一个元素，那么只打印该元素。否则，打印该元素和一个逗号和空格。
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
//            if(i == arr.length - 1){
//                System.out.print(arr[i]);
//            }else{
//                System.out.print(arr[i] + ", ");
//            }
        }
        System.out.println("]");
    }
}
