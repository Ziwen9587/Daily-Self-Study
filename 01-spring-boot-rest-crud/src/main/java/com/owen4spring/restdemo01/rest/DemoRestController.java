package com.owen4spring.restdemo01.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest-test")
public class DemoRestController {


    // Added code for the "/hello" endpoint
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

    // Added code for the "/hello" endpoint
    @GetMapping("/hello-again")
    public String sayHelloAgain(){
        return "Hello World!~~~!!!~~~";
    }
}
