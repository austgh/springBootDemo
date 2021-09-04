package com.example.demo;

import com.example.demo.config.MyConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author think
 * 配置加载读取自定义配置类
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.example.demo.dao.mapper")
@EnableConfigurationProperties(MyConfig. class )
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
