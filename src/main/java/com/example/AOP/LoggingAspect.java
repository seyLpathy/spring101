package com.example.AOP;

//using aspect annotation won't add the bean automatically

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(* com.example.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("method started");
        joinPoint.proceed();
        System.out.println("method ended");

    }
}
