package com.julin.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于 <bean id="user" class="com.julin.pojo.User"/>  添加组件
@Component
@Scope("prototype")//单例模式 原型模式
public class User {
    @Value("julin") //相当于  <property name="name" value="julin"/> 也可以放在set方法上
    public String name;
}
