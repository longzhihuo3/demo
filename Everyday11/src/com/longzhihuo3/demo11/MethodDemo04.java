package com.longzhihuo3.demo11;
//需求：定义一个方法，求长方形的周长。将结果打印出来
public class MethodDemo04 {
    public static void main(String[] args) {
     getResult1(8.89,5.63);
     getResult1(8.5,8.6);
     getResult(3);
    }
//    定义两个变量长与宽
    public static void getResult1(double a,double b){
        double perimeter=(a+b)*2;//周长
        System.out.println(perimeter);
    }
    //求圆的面积
    public static void getResult(double radius){
        double area=radius*radius*3.14;
        System.out.println(area);
    }
}
