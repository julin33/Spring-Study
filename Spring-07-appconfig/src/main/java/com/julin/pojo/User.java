package com.julin.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class User {
    @Value("julin")
    private String name;

    public User() {
        System.out.println("User被创建了");
    }
}
