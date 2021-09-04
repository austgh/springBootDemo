package com.example.demo;

import com.example.demo.util.SpringUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * Created by think on 2021/2/18.
 */
@SpringBootApplication
//@ServletComponentScan
@Import(value={SpringUtil.class})
public class App1 {
    @Bean
    public SpringUtil springUtil2() {
        return new SpringUtil();
    }
}
