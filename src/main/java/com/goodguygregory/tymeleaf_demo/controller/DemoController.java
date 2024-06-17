package com.goodguygregory.tymeleaf_demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    // create a mapping for "/hello"  to demo tymeleaf
    @GetMapping("/hello")
    public String hello(Model templateModel) {
        templateModel.addAttribute("theDate", java.time.LocalDate.now());
        // because thymeleaf is installed this will return the template
        return "helloworld";
    }
}
