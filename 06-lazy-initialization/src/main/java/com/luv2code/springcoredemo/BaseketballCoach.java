package com.luv2code.springcoredemo;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
//@Lazy
public class BaseketballCoach implements Coach {

    public BaseketballCoach(){
        System.out.println("In " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout(){
        return "Practice Basketball for 20 minutes!";
    }
}
