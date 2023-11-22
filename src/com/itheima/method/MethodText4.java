package com.itheima.method;

public class MethodText4 {
    public static void main(String[] args) {
        //求1~100的和
        int rs1 = one2nSum(100);
        System.out.println(rs1);
        //求1~865
        int rs2 = one2nSum(865);
        System.out.println(rs2);
        System.out.println("---------------------------------");
        //判断奇偶数
        judge(10);
        judge(11);

    }
    //求1~n的和
    public static int one2nSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    //判断奇偶数
    public static void judge(int n){ //判断奇偶数
        if (n % 2 == 0){ //判断是否为偶数
            System.out.println("偶数"); //是偶数
        }else{
            System.out.println("奇数"); //是奇数
        }
    }
}
