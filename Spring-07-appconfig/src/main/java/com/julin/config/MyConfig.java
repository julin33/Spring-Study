package com.julin.config;

import com.julin.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
