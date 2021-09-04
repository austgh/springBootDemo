package com.example.demo.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by think on 2021/2/18.
 * 使用注解开发一个监听器
 */
@WebListener
public class Mylistener implements ServletContextListener{
    private Logger logger = LoggerFactory.getLogger(Mylistener.class);
    @Override
    public void contextDestroyed(ServletContextEvent contextEvent) {
        logger.info("contextDestroyed");
    }
    @Override
    public void contextInitialized(ServletContextEvent contextEvent) {
        logger.info("contextInitialized");
    }
}
