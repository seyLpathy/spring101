package com.example.initialization;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class fish {
    fish(){
        System.out.println("a fish is created");
    }
}
