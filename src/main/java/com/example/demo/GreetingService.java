package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class GreetingService {

    private final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public Greeting sayHello(String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
