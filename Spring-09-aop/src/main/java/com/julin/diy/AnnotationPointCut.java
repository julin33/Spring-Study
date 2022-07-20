package com.julin.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //标注这是一个切面

public class AnnotationPointCut {
    @Before("execution(* com.julin.service.UserServiceImpl.*(..))")//切入点
    public void before(){
        System.out.println("========方法执行前========");
    }
    @After("execution(* com.julin.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("========方法执行后========");
    }
    //在环绕增强中，我们给定一个参数，代表我们要处理切入的点
    @Around("execution(* com.julin.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pj){
        System.out.println("========环绕前========");
        //执行方法

        System.out.println("========环绕后========");

    }
}
