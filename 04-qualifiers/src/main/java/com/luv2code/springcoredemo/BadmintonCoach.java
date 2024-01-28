package com.luv2code.springcoredemo;


import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Practice Badminton for 20 minutes!";
    }
}
