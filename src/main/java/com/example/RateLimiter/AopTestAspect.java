package com.example.RateLimiter;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopTestAspect {

    @Before("execution(* com.example.ratelimiter..*(..))")
    public void before() {
        System.out.println("🔥 AOP IS ACTIVE BOSS 🔥");
    }
}
