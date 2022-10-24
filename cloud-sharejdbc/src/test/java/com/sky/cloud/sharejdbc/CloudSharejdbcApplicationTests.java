package com.sky.cloud.sharejdbc;

import com.sky.cloud.sharejdbc.config.Person;
import com.sky.cloud.sharejdbc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CloudSharejdbcApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        System.out.println(userService.getUserById(1L).toString());
        System.out.println(person);
    }

}
