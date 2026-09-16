package com.example.AOP;

//using aspect annotation won't add the bean automatically

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@Aspect
public class LoggingAspect {
    private final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
    // make the interception methods align with the method being intecepted,both return or none return
    //another useful annotations
    // before afterReturning AfterThrowing
    @Around("execution(* com.example.services.*.deleteComment(..))")
    //todo need further work
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("method is started");
        joinPoint.proceed();
        logger.info("method is completed");


    }
}
