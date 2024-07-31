package com.longzhihuo3.demo11;

import java.util.Scanner;

/*
重要练习：
定义一个方法来判断数组中某一个数是否存在，将结果返回给调用处。
 */
public class MethodDemo10 {
    public static void main(String[] args) {
        //定义数组
        Scanner sc=new Scanner(System.in);
        System.out.println("请问你需要的数组长度有多长：");
        int count= sc.nextInt();
int[] arr=new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("请输入第"+(i+1)+"个数字以便填入数组中去");
            arr[i]= sc.nextInt();
        }
        System.out.println("恭喜已成功建立一个数组");
//判断一个数字是否在数组中存在

        System.out.println("请输入一个整数来判断一下它是否存在与数组之中：");
        int number1= sc.nextInt();
        boolean flag=contains(arr,number1);
        System.out.println("判断数组中"+number1+"是否存在");
        System.out.println("结果是...."+flag);

    }

    /*
    1.我要干嘛？判断数字在是否在数组中存在
    2.我干这些事情，需要什么才能完成？数组，数字（则需要两个参数）
    3.调用出是否需要继续使用结果？ture，fault
     */
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;//return的作用：返回结果，并且结束循环，方法。而如果只使用break，则只会结束循环，而不会结束方法。
    }
}
