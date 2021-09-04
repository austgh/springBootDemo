package com.example.demo.lock;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author think
 * @Date 2021/8/3 22:17
 * @Version 1.0
 */
public class TestLinkedBlockingQueue {
    static BlockingQueue<String> queue = new LinkedBlockingQueue<>();
    static Random r = new Random();
    public static void main(String[] args) {
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                try {
                    queue.put("a" + i);
                    TimeUnit.MILLISECONDS.sleep(r.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"p1").start();
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                for(;;){
                    try {
                        System.out.println(Thread.currentThread().getName()+" take -"+queue.take());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"c"+i).start();
        }
    }
}
