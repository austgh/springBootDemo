package com.example.demo.lock;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author think
 * @Date 2021/8/3 16:55
 * @Version 1.0
 */
public class TestBlockingQueueDemo {
    static ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
    static Random r = new Random();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            queue.put("a" + i);//阻塞
        }
//      queue.put("aaa");//阻塞


//      queue.add("aaa");//抛异常
        System.out.println(queue.offer("a0"));//有返回值
        System.out.println(queue.offer("a1", 1, TimeUnit.SECONDS));//超时,有返回值
        queue.take(); //阻塞
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.peek();  //查找  原数据不变
        System.out.println(queue);
    }
}
