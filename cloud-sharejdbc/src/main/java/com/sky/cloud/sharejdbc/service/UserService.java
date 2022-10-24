package com.sky.cloud.sharejdbc.service;

import com.sky.cloud.sharejdbc.entity.User;
import com.sky.cloud.sharejdbc.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.concurrent.*;

@Component
public class UserService {

    @Autowired
    private UserManager userManager;

    public User getUserById(Long id) {

        return userManager.getUserById(id);
    }

}
