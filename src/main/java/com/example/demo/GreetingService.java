package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    private GreetingDao dao = new GreetingDaoImp();

    public Greeting sayHello(String name) {
        Response response = dao.getResponse();
        return new Greeting(response.getCounter(), String.format(response.getTemplate(), name));
    }
}