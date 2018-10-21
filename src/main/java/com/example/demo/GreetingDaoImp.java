package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingDaoImp implements GreetingDao {

    private final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public Response getResponse() {
        return new Response(template, counter);
    }
}
