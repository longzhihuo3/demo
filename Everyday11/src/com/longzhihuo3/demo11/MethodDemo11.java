package com.longzhihuo3.demo11;

import java.util.Scanner;

/*
复制数组
需求：定义一个方法copyOfRange(int[] arr,int from,int to){...}
功能：将数组arr索引from结束（包含from）到to索引结束。将其中元素复制到新数组上面去
并且返回新数组
 */

public class MethodDemo11 {
    public static void main(String[] args) {
//        定义两个数组
//        一个要用来copy的数组，一个来接收复制内容的数组
        Scanner sc=new Scanner(System.in);
        System.out.println("arr1的长度为8，具体元素为：12,56,23,76,97,33,55,67");
        System.out.println("如果你要开始复制数组，那么请输入要从数组arr1的哪个索引开始检索：");
        int from= sc.nextInt();
        System.out.println("请输入要从数组arr1的哪个索引结束检索：");
        int to=sc.nextInt();
        System.out.println("已选定范围,正准备复制其中元素——————");

        int[] arr1={12,56,23,76,97,33,55,67};

        //准备调用方法
        int[] arr2=copyOfRange(arr1,from,to);
        System.out.println("输出arr2的元素：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        int newLong=(to-from);
        int[] arr2=new int[newLong];
        int k=0;
        for (int i = from; i<to; i++) {
            arr2[k]=arr[i];
            k++;
        }
        return arr2;
    }
}
