package com.aop.api;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class LmmTrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex)throws  Throwable{
        System.out.println("LmmThrowsAdvice afterThrowing 1");
    }
    public void afterThrowing(Method method,Object[]args,Object target,Exception ex)throws  Throwable{
        System.out.println("LmmThrowsAdvice afterThrowing 2:"+method.getName()+" "+target.getClass().getName());
    }
}
