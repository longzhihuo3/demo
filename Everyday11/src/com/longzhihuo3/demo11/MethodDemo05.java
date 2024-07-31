package com.longzhihuo3.demo11;
/*带返回值的方法定义与调用
方法将计算结果交给调用者使用加以利用并且引用到其他代码，而不是调用者直接在main入口里打印出来
因此必须要带有返回值的方法，这才是最完整的方法。

与之前的方法调用不一样的地方是：
1.之前的方法定义中的void 变成返回值类型，其次需要在方法定义的范围结尾补上，return 返回值;
格式：
public static 返回值类型 方法名(){
方法体;
return 返回值;
}
范例：
public static int getSum(int a,int b){
int c=a+b;
return c;
}
2.带返回值方法的调用：
（1）方法名(实参);（直接调用）
（2）整数类型 变量名+方法名(实参);(赋值调用)
（3）System.out。println(方法名(实参));（输出调用）
 */



//需求：定义一个方法，求一家商城每个季度的营业额。根据计算方法结果再计算出全年营业额。
public class MethodDemo05 {
    public static void main(String[] args) {
int Sum1=getSUm(45,89,23);
        System.out.println("第一个季度的营业额为"+Sum1);
        int Sum2=getSUm(89,56,23);
        System.out.println("第二个季度的营业额为"+Sum2);
        int Sum3=getSUm(75,56,23);
        System.out.println("第三个季度的营业额为"+Sum3);
        int Sum4=getSUm(156,45,23);
        System.out.println("第四个季度的营业额为"+Sum4);
        System.out.println("全年营业额为："+(Sum1+Sum2+Sum3+Sum4));
    }
public static int getSUm(int a,int b,int c){
    return a+b+c;//此时没有必要特地去创造一个新的变量result去等于a+b+c;这是无效做工滴
}
}
