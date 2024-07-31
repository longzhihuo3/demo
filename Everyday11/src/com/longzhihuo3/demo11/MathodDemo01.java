package com.longzhihuo3.demo11;
/*今天要学习的内容是：方法
方法：是程序里面最小的执行单位
例如：main方法，主方法。
方法作用：把重复的代码或是具有独立功能的代码打包，然后在之后要用就调用一下，不用就不调用。
方法的好处：提高代码的复用性与可维护性。

我们把一些代码打包在一起，这个过程我们称之为方法定义
方法定义后不是直接执行的，而是需要手动调节，称该过程为方法调用。

最简单的方法定义和调用
格式：
public static void 方法名（）{
    方法体（就是打包起来的代码）;
    }
实例：public static void playGame（）{
七个打印语句;
}

方法的调用
格式：方法名（）
示例：playGame（）;
注意：方法必须要先定义后调用，否则程序将会报错
 */

public class MathodDemo01 {
    public static void main(String[] args) {
//调用方法
        System.out.println("第一局：");
        playGame();
        System.out.println("第二局：");
        playGame();
    }
    //定义一个方法
    public static void playGame(){
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("GG");
    }
}
