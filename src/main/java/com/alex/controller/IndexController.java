package com.alex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @GetMapping("/")
    public String index(){
        return "this is IndexController";
    }

    @GetMapping(value = "/index")
    public String index2(){
        return "jenkins SpringBoot Project Index Test 2";
    }

}
