package com.example.spring0131.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maping {
    @GetMapping("/")
    public String welcome(){
        return "welcome";
    }
}
