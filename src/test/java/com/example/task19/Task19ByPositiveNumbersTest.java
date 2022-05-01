package com.example.task19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task19ByPositiveNumbersTest {
    @Test
    void createRangeOfRandomIntegerNumberByPositiveNumbers(){
        Task19 task19 = new Task19();
        int
                l = 3,
                d = 2;

        boolean [] actualResult = new boolean[task19.createRangeOfRandomIntegerNumbers(l, d).length];
        boolean [] expectedResult = new boolean[]{true, true, true};

        for (int i = 0; i < actualResult.length; i++) {
            if (task19.createRangeOfRandomIntegerNumbers(l, d)[i] >= 0){
                actualResult[i] = true;
            } else {
                actualResult[i] = false;
            }
        }
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
