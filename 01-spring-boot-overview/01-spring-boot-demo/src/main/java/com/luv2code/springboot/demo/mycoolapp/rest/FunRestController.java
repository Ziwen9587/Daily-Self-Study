package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class FunRestController {

    // expose "/" that return "Hello World
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!!!";
    }

}
