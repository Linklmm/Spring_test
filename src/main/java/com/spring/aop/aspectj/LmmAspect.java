package com.spring.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LmmAspect {

    @Pointcut("execution(*com.aop.aspectj.*Biz.*(..))")
    public void pointcut(){ }


}
