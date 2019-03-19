package com.piotrek.springdemo;

public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice corner kicks";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
