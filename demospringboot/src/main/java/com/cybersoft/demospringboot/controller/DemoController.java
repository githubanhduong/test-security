package com.cybersoft.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 @Controller : Cho phep dinh nghia duong dan thuong la tra ve file html (giao dien)
 @ResponseBody : Chi tra ra string
 @RestController : @Response + @Controlller cho phep dinh nghia duong dan luon luon tra ra json
 */

//    /demo                 Trong servlet su dung switch case de vao moi link
//    /demo/hello           Trong spring boot moi link dc dinh nghia theo tung method
//    /demo/detail

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("")
    public String demo(){
        return "Hello demo";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @PostMapping ("/detail")
    public String detail(){
        return "Detail";
    }
}
