package com.example.demo.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author think
 * @Date 2021/8/3 15:39
 * @Version 1.0
 */
public class TestReentrantLock {
    public static void main(String[] args) {
        ReentrantLock lock=new ReentrantLock();
        lock.unlock();
        System.out.println("---");
    }
}
