package com.piotrek.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private final String[] fortuneArray = new String[]{
            "Today is your lucky day!",
            "Today is your unlucky day!",
            "Bad fortune!"
    };

    @Override
    public String getFortune() {
        Random rand = new Random();
        int index = rand.nextInt(fortuneArray.length);
        return fortuneArray[index];
    }

}
