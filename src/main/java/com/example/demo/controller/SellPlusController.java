package com.example.demo.controller;

import com.example.demo.service.SellPlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author think
 * @version 1.0
 * @date 2021/8/25 8:50
 */
@RestController
public class SellPlusController {
    public static final int NUM=100;
    @Autowired
    SellPlusService sellService;
    private final Lock lock = new ReentrantLock(true);
    @RequestMapping(path = "sellPlus", method = RequestMethod.GET)
    public void sell() {
        CountDownLatch latch = new CountDownLatch(100);
        //如何改写成线程池处理
        for (int i = 0; i < NUM; i++) {
            new Thread(() -> {
                try {
                    latch.await();
                    lock.lock();
                    try {
                        sellService.sellProduct();
                    } finally {
                        lock.unlock();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            latch.countDown();
        }
    }
}
