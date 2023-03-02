package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author think
 * @version 1.0
 * @date 2021/8/30 11:03
 */
public class TestSpring {
    public static void main(String[] args) {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            System.out.println("myFactoryBean: " + context.getBean("myFactoryBean"));
            System.out.println("&myFactoryBean: " + context.getBean("&myFactoryBean"));
            System.out.println("myFactoryBean‐class: " +
                    context.getBean("myFactoryBean").getClass());

    }
}
