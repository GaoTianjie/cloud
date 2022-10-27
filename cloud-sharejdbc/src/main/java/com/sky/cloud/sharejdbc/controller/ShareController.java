package com.sky.cloud.sharejdbc.controller;

import com.sky.cloud.sharejdbc.config.Person;
import com.sky.cloud.sharejdbc.service.UserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ShareController {

    @Autowired
    private UserService userService;

    @Autowired
    private Person person;

    @RequestMapping("share")
    public String share() {
        log.debug("debug");
        log.info("info");
        log.error("error");
        return userService.getUserById(1L).toString() + person.getUserName() + person.getAge();
    }
}
