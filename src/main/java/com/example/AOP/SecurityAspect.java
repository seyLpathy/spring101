package com.example.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SecurityAspect {
    private final Logger logger = LoggerFactory.getLogger(SecurityAspect.class);

    @Around("execution(* com.example.services.*.*(..))")
    public void secure(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Security Aspect: Calling the intercepted method");
        joinPoint.proceed();
        logger.info("Security Aspect: method executed and returned");
    }

}
