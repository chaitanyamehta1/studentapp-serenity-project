package com.lc.df.studentapp.utils;

import java.util.Random;

/**
 * Created by Chaitanya
 */
public class TestUtils {
    public static String getRandomValue() {
        Random random = new Random();
        int randomInt = random.nextInt(100000);
        return Integer.toString(randomInt);
    }
}
