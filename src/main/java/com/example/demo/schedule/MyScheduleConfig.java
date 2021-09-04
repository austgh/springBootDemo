package com.example.demo.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by think on 2021/2/18.
 */
@Configuration // 声明类为系统配置类
@EnableScheduling // 开启调度任务
public class MyScheduleConfig {
    private Logger logger = LoggerFactory.getLogger(MyScheduleConfig.class);
    @Scheduled(cron = "0 0/1 0 * * ?") // 定义调度器
    public void job1() {
        logger.info("this is my first job execute");
    }
}
