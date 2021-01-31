package com.studies.exercisesSB.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping(path = {"/hello", "/greeting"})
    public String hello() {
        return "Hello Spring Boot!";
    }

    @PostMapping(path = "/hello")
    public String hello_post() {
        return "Hello String, but now with POST";
    }
}
