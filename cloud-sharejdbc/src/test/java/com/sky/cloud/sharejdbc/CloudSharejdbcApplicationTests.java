package com.sky.cloud.sharejdbc;

import com.sky.cloud.sharejdbc.config.Person;
import com.sky.cloud.sharejdbc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class CloudSharejdbcApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    UserService userService;

    @Autowired
    ServiceA serviceA;

    @Test
    void contextLoads() throws IOException {
        serviceA.methodB();
    }

}
