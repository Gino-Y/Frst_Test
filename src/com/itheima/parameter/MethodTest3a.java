package com.itheima.parameter;

public class MethodTest3a {
    public static void main(String[] args) {
        //打印int类型的数组的元素
        //格式为[1, 2, 3, 4, 5]
        int[] arr = {10, 20, 30, 40, 50};
        printArray(arr);

        System.out.println("--------------------------------------------------");
        int[] arr1 = null;
        printArray(arr1);
    }

    public static void printArray(int[] arr){
        // 对传入的数组进行合法性判断
        if (arr == null) {
            System.out.println("数组为空");
            return;
        }
        
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            // 如果当前索引 i 是数组的最后一个元素，那么只打印该元素。否则，打印该元素和一个逗号和空格。
           System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
