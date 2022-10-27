package com.sky.cloud.sharejdbc;

import com.sky.cloud.sharejdbc.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class ServiceB {
    @Autowired
    private UserManager userManager;

    @Transactional
    public void methodA() throws NullPointerException{
        // insert into user （name,age）values("李四"，50)；
//        throw new NullPointerException();
    }

    @Transactional
    public void methodB()  throws IOException {
        // ins// ert into user （name,age）values("李四2"，50)；
        userManager.insert(109L);
        throw new IOException();
    }
}
