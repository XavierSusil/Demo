package com.example.demo.controller;

import com.example.demo.dto.GreetingRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public  GreetingRecord Greet() {

        return new GreetingRecord("Hello , World",1);
    }
}
