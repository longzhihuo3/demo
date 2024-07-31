package com.longzhihuo3.demo11;
/*带参数的方法定义与调用
定义格式
public static void 方法名(参数){...}
示例
public static void method(int number1,int number2){...}

带参数的调用
格式：
方法名（参数）;
范例：method(1，2);||method(变量1，变量2);

注意事项：方法调用的时候，参数的数量与类型必须与方法定义中小括号里的变量一一对应，否则程序将会报错。
 */
public class MethodDemo03 {
    /*形参：方法定义中的参数；
    实参：方法调用中的参数；
    形参与实参必须一一对应。
     */

    public static void main(String[] args) {
        getSum(15,56);//方法调用中的参数都为实参
        getSum(89,786);
        getSum(56,985);
        getSum(123,466);
        int a=156;
        int b=896;
        getSum(a,b);//其中a，b为实参
    }
    public static void getSum(int number1,int number2){//其中number1，number2为形参;
        int result=number1+number2;
        System.out.println(result);
    }

}

