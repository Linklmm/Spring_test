package com.spring.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(2)
@Component
public class BeanInterfaceImplOne implements BeanInterface {
}
