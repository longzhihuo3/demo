package com.longzhihuo3.demo11;
/*
重要练习：
设计一个方法求数组的最大值，并将最大值返回
 */
public class MethodDemo09 {
    public static void main(String[] args) {
        int[] arr={12,56,89,32,41,75,56,37};
        int a=Max(arr);
        System.out.println(a);
    }
    public static int Max(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(arr[i],max);
        }
        return max;
    }
}

