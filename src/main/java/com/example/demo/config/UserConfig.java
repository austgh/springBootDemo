package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author think
 * @date 2024年04月16日 15:4
 * https://mp.weixin.qq.com/s/zfxihBBIZq8lQq56xXIBbA
 * @Bean 与 @Component 用在同一个类上，会怎么样？
 */
@Configuration
public class UserConfig {
    @Value("${user.name}")
    private String userName;

    @Bean
    public UserManager userManager() {
        UserManager userManager=new UserManager(userName);
        return userManager;
    }


}
