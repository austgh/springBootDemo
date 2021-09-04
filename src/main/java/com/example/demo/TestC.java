package com.example.demo;

/**
 * Created by think on 2021/2/18.
 */
public class TestC {
    public TestC() {
        System.out.println("------TestC");
    }

    public void printName() {
        System.out.println("类名 ：" + Thread.currentThread().getStackTrace()[1].getClassName());
    }
}
