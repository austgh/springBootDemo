package com.example.demo.future;

import java.util.concurrent.*;

/**
 * @Author think
 * @Date 2021/7/30 17:18
 * @Version 1.0
 */
public class T14_MyRejectedHandler {
    public static void main(String[] args) {
        ExecutorService service = new ThreadPoolExecutor(4, 4, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(6), Executors.defaultThreadFactory(), new MyHandler());
    }
    static class MyHandler implements RejectedExecutionHandler{

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            if(executor.getQueue().size()<1000){
                System.out.println(executor);
                System.out.println(r);
            }
        }
    }
}
