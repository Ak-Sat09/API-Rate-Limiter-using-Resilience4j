package com.example.RateLimiter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AOPCheck implements CommandLineRunner {

    private final TestController controller;

    public AOPCheck(TestController controller) {
        this.controller = controller;
    }

    @Override
    public void run(String... args) {
        System.out.println("Is AOP Proxy: " +
                org.springframework.aop.support.AopUtils.isAopProxy(controller));
    }
}
