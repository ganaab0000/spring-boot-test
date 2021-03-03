package com.example.test.controller.json;

import com.example.test.entity.member.TestMember;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class JsonTestController {

    @GetMapping("/jsonTestMember")
    public TestMember jsonTestMember() {
        log.info("jsonTestMember()");

        TestMember tm = new TestMember();

        return tm;
    }
}
