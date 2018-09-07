package com.spring.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BeanInvoker {
    @Autowired
    private List<BeanInterface> list;

    public void say(){
        if (null!=list){
            for (BeanInterface bean:list){
                System.out.println(bean.getClass().getName());
            }
        }else {
            System.out.println("List<beanInterface> list is null!!");
        }
    }
}
