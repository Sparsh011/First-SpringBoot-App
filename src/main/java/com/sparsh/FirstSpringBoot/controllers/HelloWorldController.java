package com.sparsh.FirstSpringBoot.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public HelloResponse sayHello() {
        return new HelloResponse("Hello", "OK");
    }
}

class HelloResponse {
    private String message;
    private String status;

    public HelloResponse(String message, String status) {
        this.message = message;
        this.status = status;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

