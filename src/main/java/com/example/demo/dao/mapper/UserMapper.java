package com.example.demo.dao.mapper;

import com.example.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;

/**
 * @author think
 * @version 1.0
 * @date 2021/8/30 15:27
 */
public interface UserMapper {
    @Insert("insert into user_info(age,name)values(#{age},#{name})")
    public void insert(UserInfo userInfo);
}
