package com.docix.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//Note that we added 'ComponentScan' so that the application would scan the packages and find
//the controller that we need.
@EnableAutoConfiguration
@ComponentScan
public class AppConfig {

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
