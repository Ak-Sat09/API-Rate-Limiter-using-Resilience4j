package com.example.RateLimiter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.ratelimiter.RequestNotPermitted;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    @RateLimiter(name = "apiLimiter", fallbackMethod = "rateLimitFallback")
    public String test() {
        return "Request allowed Boss";
    }

    public String rateLimitFallback(RequestNotPermitted ex) {
        return "Rate limit exceeded Boss ❌";
    }
}
