package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class TennisCoach implements Coach {

    public TennisCoach(){
        System.out.println("In " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout(){
        return "Practice Tennis for 30 minutes!";
    }
}
