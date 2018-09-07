package com.spring.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
public class BeanAnnotation {

    public void say(String arg){
        System.out.println("beanAnnotation:" +arg);
    }
    public void myHashCode(){
        System.out.println("beanAnnotation:"+this.hashCode());
    }
}
