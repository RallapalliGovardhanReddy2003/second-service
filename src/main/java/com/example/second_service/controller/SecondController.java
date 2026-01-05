package com.example.second_service.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class SecondController {

    @GetMapping("/message")
    public String test() {
        return "Hello i am  Calling in Second Service";
    }

}