package com.example.demo.config;

import org.springframework.stereotype.Component;

/**
 * @author think
 * @date 2024年04月16日 15:47
 * \
 */
@Component
public class UserManager {
    private String userName;
    public UserManager(){
        System.out.println("User 空构造方法 this ="+this);
    }
    public UserManager(String userName){
        System.out.println("User 非空构造方法 this ="+this);
    }
    public String getUserName(){
        return userName;
    }

}
