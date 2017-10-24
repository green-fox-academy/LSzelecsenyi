package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class HelloRESTController {

    private AtomicInteger count = new AtomicInteger(0);

    @ResponseBody
    @RequestMapping(value="/greeting")
    public String greeting(@RequestParam String name) {
        Greeting greeting = new Greeting(count.incrementAndGet(), "hi, " + name);
        return greeting.content + "! This site was loaded " + greeting.id + " times since last server start.";
    }

//    Hello, Your name! This site was loaded 3 times since last server start.

}
