package com.luv2code.springcoredemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //Define a private filed for the dependency
    private Coach myCoach;

//    @Autowired
//    public DemoController (Coach aCoach){
//         this.myCoach = aCoach;
//    }
    @Autowired
    public void setCoach(Coach aCoach) {
        this.myCoach = aCoach;
    }



    @GetMapping("/workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
