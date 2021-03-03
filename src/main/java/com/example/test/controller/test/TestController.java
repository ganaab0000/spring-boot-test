package com.example.test.controller.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    private final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/test")
    public String getTest() {
        log.info("getTest() 동작중!");

        return "test";
    }
}
