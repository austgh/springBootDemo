package com.example.demo.service.impl;


import com.example.demo.dao.mapper.UserMapper;
import com.example.demo.entity.UserInfo;
import com.example.demo.exception.AgeException;
import com.example.demo.exception.AgeExceptionOver18;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Transactional(rollbackFor = AgeException.class)
    public void insert(UserInfo userInfo) throws Exception {
        userMapper.insert(userInfo);
        if (userInfo.getAge() > 18) {
            throw new AgeExceptionOver18();
        }
        if (userInfo.getAge() < 10) {
            throw new AgeException();
        }
    }
}
