package com.jenkins.xingh_jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "宋文豪....";
    }

    @GetMapping("test2")
    public String test1(){
        return "jenkins2!!!";
    }
}
