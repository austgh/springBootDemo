package com.example.demo;

import com.example.demo.util.SpringUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by think on 2021/2/18.
 */
//@SpringBootApplication
//@ServletComponentScan
@Configuration
@ComponentScan("com.example.demo")
@Import(value={SpringUtil.class})
@MapperScan("com.example.demo.dao.mapper")
public class AppConfig {
    @Bean
    public SpringUtil springUtil2() {
        return new SpringUtil();
    }
}
