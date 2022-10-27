package com.sky.cloud.sharejdbc;

import com.sky.cloud.sharejdbc.manager.UserManager;
import com.sky.cloud.sharejdbc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class ServiceA {
    @Autowired
    private ServiceB serviceB;

    @Autowired
    UserManager userManager;

    @Transactional
    public void methodA(){
        //执行sql
        userManager.insert(100L);
        try{
            serviceB.methodA();
        }catch(Exception e){

        }
    }

    @Transactional
    public void methodB() throws IOException {
        //执行sql
        userManager.insert(103L);
        serviceB.methodB();
    }

}
