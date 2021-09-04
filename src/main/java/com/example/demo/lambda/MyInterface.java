package com.example.demo.lambda;

public interface MyInterface {
    void testMethod();
}

class Myclass implements MyInterface{


    @Override
    public void testMethod() {
        System.out.println("我实现了接口中方法！");
    }
}

class Demo{
    public static void main(String[] args) {
   /*     Myclass myclass=new Myclass();
        myclass.testMethod();*/
//        MyInterface myInterface=new MyInterface() {
//            @Override
//            public void testMethod() {
//                System.out.println("我实现了接口中方法!");
//            }
//        };
//        myInterface.testMethod();


        MyInterface myIn=()-> {
            System.out.println("我实现了接口中方法");
        };
        myIn.testMethod();

        //变型
        MyInterface myIn1=()->{
            System.out.println("我实现了接口中方法");
        } ;
    }
}
