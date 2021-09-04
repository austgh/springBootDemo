package com.example.demo;

import com.example.demo.util.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

/**
 * Created by think on 2021/2/18.
 */
@SpringBootApplication
public class App {
    /**
     * 注册 Spring Util
     * 这里为了和上一个冲突，所以方面名为： springUtil2
     * 实际中使用 springUtil
     */
//    @Bean
//    public SpringUtil springUtil2() {
//        return new SpringUtil();
//    }

    /**
     * 参数里 VM 参数设置为：
     * -javaagent:.\lib\springloaded-1.2.4.RELEASE.jar -noverify
     *
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
