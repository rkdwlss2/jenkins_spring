package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/test")
    private String test(){
        return "test";
    }

    @GetMapping("/test2")
    private String test2(){
        return "test2";
    }

    @GetMapping("/test3")
    private String test3(){
        return "test3";
    }

    @GetMapping("/test4")
    private String test4(){
        return "test4";
    }

    @GetMapping("/test5")
    private String test5(){
        return "test5";
    }

}
