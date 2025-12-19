# API Rate Limiter using Resilience4j

This project demonstrates how to implement an **API rate limiter** using **Resilience4j** in a **Spring Boot** application.

The rate limiter restricts clients to **3 requests within 10 seconds** to prevent abuse and ensure system stability.

---

##  Features
- Fixed-window rate limiting
- Configurable request limit and refresh duration
- Graceful handling of `429 Too Many Requests`
- Easy integration with Spring Boot
- Annotation-based implementation

---

##  Rate Limiting Strategy

**Algorithm Used:** Fixed Window Rate Limiting  

**Configuration:**
- **Limit:** 3 requests
- **Window Duration:** 10 seconds
- Requests exceeding the limit are rejected until the window resets

> Resilience4j internally uses a fixed-window based rate limiting mechanism.

---

##  Tech Stack
- Java 11
- Spring Boot
- Resilience4j
- Maven

---

##  Configuration Example

```yaml
resilience4j:
  ratelimiter:
    instances:
      apiRateLimiter:
        limit-for-period: 3
        limit-refresh-period: 10s
        timeout-duration: 0
