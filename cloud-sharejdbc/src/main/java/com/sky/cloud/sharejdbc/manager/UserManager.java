package com.sky.cloud.sharejdbc.manager;

import com.sky.cloud.sharejdbc.entity.User;
import com.sky.cloud.sharejdbc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManager {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}
