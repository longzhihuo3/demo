package com.longzhihuo3.demo11;

import java.util.Random;

/*打乱数组中的数据
需求：定义一个数组，存入一到五。要求打乱数组中所有数据的顺序
 */
public class demo01 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
