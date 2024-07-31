package com.longzhihuo3.demo11;

import java.util.Scanner;

//要求：定义一个方法，在方法内部打印我的的所有信息
public class MethodDemo02 {
    public static void main(String[] args) {
        Message();
        methodMath();

    }

    public static void Message() {
        System.out.println("身高175");
        System.out.println("体重70kg");
        System.out.println("Be able To love Everything");
    }

    //要求：定义一个方法，定义两个变量，而且将两个变量相加。
    public static void methodMath() {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入a的整数值");
        a=sc.nextInt();
        System.out.println("请输入b的整数值");
        b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum+"为a和b的相加值");
    }
}