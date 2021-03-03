package com.example.test.controller.attribute;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DateFormat;
import java.util.Date;

@Log
@Controller
public class AttributeTestController {
    @GetMapping("/attributeTest")
    public String getAttributeTest(Model model) {
        log.info("getAttributeTest(): Spring 속성");
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        model.addAttribute("responseServerTime", formattedDate);

        return "attribute/test";


    }
}
