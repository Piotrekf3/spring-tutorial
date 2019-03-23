package com.piotrek.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice penalty kicks";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
