package com.example.demo.lambda;
@FunctionalInterface
public interface IConvert<F,T> {
    T convert(F form);
}

class Demo4{
    public static void main(String[] args) {
        IConvert<String,String> iConvert= Something::startsWith;
    }
}