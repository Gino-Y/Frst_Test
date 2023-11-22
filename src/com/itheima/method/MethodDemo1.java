package com.itheima.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        //方法的应用
         int rs1 = sum(10, 20);
        System.out.println(rs1);

        int rs2 = sum(24, 98);
        System.out.println(rs2);
    }

    //方法的定义
    public static int sum(int a, int b){
        return a + b;
    }
}
