package com.example.demo.controller;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author think
 */
@SuppressWarnings("ALL")
@RestController
@RequestMapping("/user")
public class UserController {

    @SuppressWarnings("AlibabaRemoveCommentedCode")
    @RequestMapping("/zeroException")
    public int zeroException() {
        return 100 / 0;
    }

    @Resource
    private UserServiceImpl userService;

    @GetMapping("/insertUser")
    public String insertUser(int age) {
        try {
            UserInfo userInfo = new UserInfo();
            userInfo.setAge(age);
            userInfo.setName("why");
            userService.insert(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "hello";
    }
}
