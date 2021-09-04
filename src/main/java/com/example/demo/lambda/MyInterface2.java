package com.example.demo.lambda;

public interface MyInterface2 {
    void testInterface(int m);
}

class Demo2{
    public static void main(String[] args) {
        MyInterface2 my=(int num)->{
            System.out.println("你好"+num);
        };
        my.testInterface(3);
        //MyInterface2 m2=(int x)->{};
        //一个参数类型可以省略 名字可以随便起，实现只有一句话，大括号可以省略
        MyInterface2 m2=x-> System.out.println("你好"+x);
        m2.testInterface(4);
    }
}
