package com.example.demo.importbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qxt
 * @date 2022年12月29日 7:15 PM
 */
//@Configuration
public class MyConfiguration {
    @Bean
    public PersonDemo1 person() {
        PersonDemo1 personDemo1 = new PersonDemo1();
        personDemo1.setName("spring");
        return personDemo1;
    }
}
