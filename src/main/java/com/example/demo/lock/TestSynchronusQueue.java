package com.example.demo.lock;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author think
 * @Date 2021/8/3 22:25
 * @Version 1.0
 */
public class TestSynchronusQueue {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> queue = new SynchronousQueue<>();//容量为零
        new Thread(()->{
            try {
                System.out.println("开始");
                System.out.println(queue.take()+" 123");//
                System.out.println("结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        TimeUnit.SECONDS.sleep(5);
        queue.put("aaa");//阻塞等待消费者
//        queue.put("bbb");
//        queue.add("aaa");
        queue.put("bbb");//有问题 被阻塞了 没人唤醒 程序向下执行不了
        queue.take();
        System.out.println(queue.size());
    }
}
