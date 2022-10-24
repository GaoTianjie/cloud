package com.sky.cloud.sharejdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sky.cloud.sharejdbc.mapper")
public class CloudSharejdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudSharejdbcApplication.class, args);
        System.out.println("sharejdbc successful...");
    }

}
