package com.longzhihuo3.demo11;
//需求：定义的方法，比较两个长方形的面积
public class MethodDemo06 {
    public static void main(String[] args) {
        double a=oblong(6.5,5.3);
        double b=oblong(8.4,2.1);
        if(a>b) System.out.println("a长方形面积更加大");
        else System.out.println("b长方形的面颊更加大");

    }
    public static double oblong(double Long,double wide){
        double area=Long*wide;
        return area;
    }
}
