package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class FunRestController {

    @Value("${course.name}")
    private String courseName;

    @Value("${course.duration}")
    private String courseDuration;

    // expose "/" that return "Hello World
    @GetMapping("/course-info")
    public String courseInfo() {
        return courseName + " - " + courseDuration;
    }

    // expose "/" that return "Hello World
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!!!";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "<h1>Run a hard 5 k</h1>";
    }
}
