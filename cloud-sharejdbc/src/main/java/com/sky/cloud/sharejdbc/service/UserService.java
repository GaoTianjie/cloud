package com.sky.cloud.sharejdbc.service;

import com.sky.cloud.sharejdbc.entity.User;
import com.sky.cloud.sharejdbc.manager.UserManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserManager userManager;

    public User getUserById(Long id) {

        return userManager.getUserById(id);
    }

}
