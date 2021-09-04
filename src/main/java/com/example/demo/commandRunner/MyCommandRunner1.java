package com.example.demo.commandRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author think
 * @date 2021/2/18
 * @version 1.0
 * 为了实现服务器启动即执行某些操作，只需要实现spring boot中的CommandLineRunner接口即可
 * 设置启动执行顺序
 */
@Component
@Order(value = 1)
public class MyCommandRunner1  implements CommandLineRunner{
    private final Logger logger = LoggerFactory.getLogger(MyCommandRunner1.class);
    /**
     * TODO 系统启动即会执行Run方法
     */
    @Override
    public void run(String... arg0) {
        logger.info("执行启动任务1...");
    }
}
