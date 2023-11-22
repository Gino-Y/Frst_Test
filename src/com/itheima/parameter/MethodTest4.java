package com.itheima.parameter;

public class MethodTest4 {
    public static void main(String[] args) {
        //定义两个数组
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {10, 20, 30, 40, 50};
        //调用equals方法，比较两个数组是否一样
        if (equals(arr1, arr2)) {
            System.out.println("两个数组一样");
        } else {
            System.out.println("两个数组不一样");
        }
    }
    
    //判断两个数组是否一模一样
    public static boolean equals(int[] arr1, int[] arr2){
        //1. 首先判断两个数组是否为null
        if (arr1 == null && arr2 == null) {
            System.out.println("两个数组都为空");
            return true;
        }
        if (arr1 == null || arr2 == null) {
            System.out.println("数组为空");
            return false;
        }
        //2. 然后比较两个数组的长度，如果长度不相同，那么两个数组一定不一样
        if(arr1.length != arr2.length){
            return false;
        }
        //3. 如果长度相同，那么再比较两个数组中的每一个元素，只要有一个元素不相同，那么两个数组就不一样
        for (int i = 0; i < arr1.length; i++) {
            //如果两个数组中的元素不相同，那么两个数组就不一样
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        //4. 如果两个数组中的元素都相同，那么两个数组就一样
        return true;
    }
}
