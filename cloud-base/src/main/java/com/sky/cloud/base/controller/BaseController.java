package com.sky.cloud.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    @RequestMapping("base")
    public String hello() {
        return "base";
    }
}
