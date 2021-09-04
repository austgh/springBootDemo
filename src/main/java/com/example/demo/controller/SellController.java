package com.example.demo.controller;

import com.example.demo.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;

/**
 * @author think
 * @version 1.0
 * @date 2021/8/24 9:35
 *  why 哥 超卖demo 见SellController
 * 文章链接:https://mp.weixin.qq.com/s/0_5mPhZPdBzb5Gk4ijyQZg
 * 几行烂代码，我赔了16万。
 */
@RestController
public class SellController {
    public static final int NUM=100;
    @Autowired
    SellService sellService;

    @RequestMapping(path = "sell", method = RequestMethod.GET)
    public void sell() {
        CountDownLatch latch = new CountDownLatch(100);
        //如何改写成线程池处理
        for (int i = 0; i < NUM; i++) {
            new Thread(() -> {
                try {
                    latch.await();
                    sellService.sellProduct();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            latch.countDown();
        }
    }
}
