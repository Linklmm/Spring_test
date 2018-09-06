package com.aop.api;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class LmmBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("LmmBeforeAdvice"+method.getName()+" "+o.getClass().getName());
    }
}
