package com.longzhihuo3.demo11;
/*方法的重载
简单来说就是多个方法定义时的命名是同一个，但是这些方法的参数类型或是参数个数是不同的，这些同名的方法就构成了重载关系
同一个类之中，方法名相同，参数不同的方法，与返回值无关。
实现重载只有两个条件：
1.方法名相同2.参数不同
参数不同：个数不同，类型不同，顺序不同。（只需要其中之一不同即可达到参数不同的条件）
与返回值无关可以举个例子
：public class MethodDemo07 {
public static void fn(int a){...}
public static int fn(int a){...}
}
上例中，void与int不同，但这个是返回值类型因此不能算作是方法重载。

参数不同中的顺序不同举例：
public class MethodDemo07 {
public static void fn(int a,double b){...}
public static void fn(double a,int b){...}
}

 */

//需求：使用方法重载的办法，设计比较两个整数死否相同的方法。
//要求：兼容全整数类型(byte,short,int,long)
public class MethodDemo07 {
    public static void main(String[] args) {
        System.out.println("第一次");
     getSum(12,23);
        System.out.println("第二次");//要调用哪种整数类型之前一定要说明类型如左边的数据一样方，法名(数据类型)数据;
     getSum((byte)12,(byte)56);//当然也有另外一种方式去说明数据的类型就是直接在main入口里直接定义变量是一种或是多种类型的数据，然后在调用里直接引用变量。例：{byte a=11;getSum(a);}
        System.out.println("第三次");
     getSum((short)10,(short)10);
        System.out.println("第四次");
     getSum((long)780,(long)789);
    }
    public static void getSum(byte a,byte b){
        System.out.println("byte");
        System.out.println(a==b);
    }
    public static void getSum(short a,short b){
        System.out.println("short");
        System.out.println(a==b);
    }
    public static void getSum(int a,int b){
        System.out.println("int");
        System.out.println(a==b);
    }
    public static void getSum(long a,long b){
        System.out.println("long");
        System.out.println(a==b);
    }
}
