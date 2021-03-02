package com.example.test.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {
    @GetMapping("/restTest")
    public String getRestTest(){
        return "Hello from Spring Rest Controller";
    }
}
