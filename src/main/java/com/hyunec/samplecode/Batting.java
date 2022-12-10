package com.hyunec.samplecode;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum Batting {
    STRIKE(0),
    BALL(1),
    HIT(2);

    private final Integer value;

    public static Batting getByValue(final Integer value) {
        return Arrays.stream(Batting.values())
                .filter(i -> i.value.equals(value))
                .findFirst()
                .orElseThrow();
    }
}
