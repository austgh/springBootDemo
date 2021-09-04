package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
