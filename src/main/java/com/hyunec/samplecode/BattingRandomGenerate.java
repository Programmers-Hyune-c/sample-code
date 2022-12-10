package com.hyunec.samplecode;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class BattingRandomGenerate implements RandomGenerate {

    private static final int BATTING_CASE_COUNT = 3;

    private static final Random RANDOM = new Random();

    @Override
    public Batting generate() {
        return Batting.getByValue(RANDOM.nextInt(BATTING_CASE_COUNT));
    }
}
