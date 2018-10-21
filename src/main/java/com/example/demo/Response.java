package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

public class Response {

    private final String template;
    private final AtomicLong counter;

    public Response(String template, AtomicLong counter) {
        this.template = template;
        this.counter = counter;
    }

    public String getTemplate() {
        return template;
    }

    public long getCounter() {
        return counter.incrementAndGet();
    }
}
