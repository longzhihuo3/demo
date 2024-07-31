package com.longzhihuo3.demo11;
/*
重要练习：
设计一个方法用于数组遍历，要求遍历的结果在同一行上。例如：【11，22，33，44，55】
 */
public class MethodDemo08 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        printArr(arr);
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i==0) System.out.print("[");
            if (i== (arr.length)-1)
                System.out.print(arr[i]+"]");
            else System.out.print(arr[i]+",");

        }
    }
}
