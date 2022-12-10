package com.hyunec.samplecode;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Batting {
    STRIKE(0),
    BALL(1),
    HIT(2);

    private final Integer value;
}
