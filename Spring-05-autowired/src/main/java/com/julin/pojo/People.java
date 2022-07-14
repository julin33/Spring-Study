package com.julin.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;

@Data
public class People {
    //如果显式定义了Autowired的required的属性为false。说明这个对象可以为null，否则不允许为空
    //先按类型再按名字匹配
    @Autowired(required = false)
    private Dog dog;
    @Autowired
    @Qualifier(value = "cat111")//指定唯一的bean对象注入 复杂环境使用
//    @Resource (name = "cat111") //也可以指定 比较少用 先匹配名字 在通过类型
    private Cat cat;
    private String name;
}
