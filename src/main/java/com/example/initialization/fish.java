package com.example.initialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class fish {
    fish(){
        System.out.println("a fish is created");
    }
}
