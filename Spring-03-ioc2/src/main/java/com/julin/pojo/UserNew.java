package com.julin.pojo;

import lombok.Data;
@Data
public class UserNew {
    private String name;

    public UserNew (String name){
        this.name = name;
    }
    public void show(){
        System.out.println("name=" + name);
    }
}
