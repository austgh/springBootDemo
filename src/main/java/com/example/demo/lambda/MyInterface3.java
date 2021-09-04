package com.example.demo.lambda;

@FunctionalInterface
public interface MyInterface3 {
    int testMethod(int x ,int y);
}

class Demo3{
    public static void main(String[] args) {
        MyInterface3 m3=(x,y)->{
            System.out.println("第一行的值:"+x);
            System.out.println("第二行的值:"+y);
            return x+y;
        };
        System.out.println(m3.testMethod(3, 4));

        //实现如果只有一行，return 也可以省略
        MyInterface3 m4=(x,y)->x+y;
    }
}
//