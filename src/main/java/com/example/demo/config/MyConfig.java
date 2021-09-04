package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author think
 * @date 2021/2/19
 * 读取系统配置文件中的person开头的所有配置，并自动封装到实体类中
 */
@ConfigurationProperties(prefix = "person")
public class MyConfig {
    private String name;
    private String gender;
    @SuppressWarnings("unused")
    public MyConfig() {
    }

    @SuppressWarnings("unused")
    public MyConfig(String name, String gender) {
        super ();
        this .name = name;
        this .gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this .name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this .gender = gender;
    }

    @Override
    public String toString() {
        return "MyConfig{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
