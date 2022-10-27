package com.sky.cloud.sharejdbc.manager;

import com.sky.cloud.sharejdbc.entity.User;
import com.sky.cloud.sharejdbc.mapper.UserMapper;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserManager {

    @Autowired
    private UserMapper userMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void insert(Long id) {
        userMapper.insert(id);
    }
}
