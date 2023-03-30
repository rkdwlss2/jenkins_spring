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

    @GetMapping("/test6")
    private String test6(){
        return "test6";
    }


    @GetMapping("/test7")
    private String test7(){
        return "test7";
    }

    @GetMapping("/test8")
    private String test8(){
        return "test8";
    }

    @GetMapping("/test9")
    private String test9(){
        return "test9";
    }
    @GetMapping("/test10")
    private String test10(){
        return "test10";
    }


}

