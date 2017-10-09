package com.example.ryanforgie.rankingsystem;

import java.util.Random;

/**
 * Created by ryanforgie on 09/10/2017.
 */

public class RandomNumberGenerator {
    public int generateNumber(int upperLimit) {
        Random random = new Random();
        int randomNumber = random.nextInt(upperLimit);
        return randomNumber;
    }
}
