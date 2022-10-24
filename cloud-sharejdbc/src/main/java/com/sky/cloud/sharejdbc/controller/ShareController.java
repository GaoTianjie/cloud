package com.sky.cloud.sharejdbc.controller;

import com.sky.cloud.sharejdbc.config.Person;
import com.sky.cloud.sharejdbc.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShareController {

    @Autowired
    private UserService userService;

    @Autowired
    private Person person;

    @RequestMapping("share")
    public String share() {
        return userService.getUserById(1L).toString() + person.getUserName() + person.getAge();
    }
}
