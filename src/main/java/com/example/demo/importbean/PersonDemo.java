package com.example.demo.importbean;

import org.springframework.stereotype.Component;

/**
 * @author qxt
 * @date 2022年12月29日 7:06 PM
 */
@Component
public class PersonDemo {
    private String name;

    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "PersonDemo{" +
                "name='" + name + '\'' +
                '}';
    }


}
