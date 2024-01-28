package com.luv2code.springcoredemo;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class BadmintonCoach implements Coach {

    public BadmintonCoach(){
        System.out.println("In " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice Badminton for 20 minutes!";
    }
}
