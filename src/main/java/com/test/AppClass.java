package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AppClass {

    
    public static void main(String[] args) {
        SpringApplication.run(AppClass.class, args);
    }
}
