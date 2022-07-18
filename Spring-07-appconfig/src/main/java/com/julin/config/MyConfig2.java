package com.julin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.julin.pojo")
@Import(MyConfig.class)
public class MyConfig2 {
}
