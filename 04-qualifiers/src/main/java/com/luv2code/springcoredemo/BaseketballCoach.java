package com.luv2code.springcoredemo;
import org.springframework.stereotype.Component;


@Component
public class BaseketballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Practice Basketball for 20 minutes!";
    }
}
