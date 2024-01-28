package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Practice Tennis for 30 minutes!";
    }
}
