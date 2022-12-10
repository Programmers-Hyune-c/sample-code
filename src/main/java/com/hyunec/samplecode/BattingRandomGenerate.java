package com.hyunec.samplecode;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class BattingRandomGenerate implements RandomGenerate {

    private static final Random RANDOM = new Random();

    @Override
    public Batting generate() {
        Batting[] battings = Batting.values();
        return battings[RANDOM.nextInt(battings.length)];
    }
}
