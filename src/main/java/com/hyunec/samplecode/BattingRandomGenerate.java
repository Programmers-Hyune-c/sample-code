package com.hyunec.samplecode;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class BattingRandomGenerate implements RandomGenerate {

    private static final int BATTING_CASE_COUNT = 3;

    private final Random random = new Random();

    @Override
    public Batting generate() {
        final int randomValue = random.nextInt(BATTING_CASE_COUNT);

        if (Batting.STRIKE.getValue() == randomValue) {
            return Batting.STRIKE;
        }

        if (Batting.BALL.getValue() == randomValue) {
            return Batting.BALL;
        }

        return Batting.STRIKE;
    }
}
