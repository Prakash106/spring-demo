package com.learningarea.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiResource {

    @GetMapping("/")
    public String getBase() {
        return "Hello, Welcome to spring application";
    }

    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Welcome to the programming area.";
    }

}
