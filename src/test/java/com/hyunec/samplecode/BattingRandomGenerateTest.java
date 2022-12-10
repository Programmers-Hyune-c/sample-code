package com.hyunec.samplecode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
class BattingRandomGenerateTest {

    @Autowired
    private RandomGenerate randomGenerate;

    @DisplayName("생성 결과로 strike, ball, hit 가 나와야 한다. - 100회 반복")
    @Test
    void repeat() {
        // when
        final List<Batting> battings = IntStream.range(0, 100)
                .mapToObj(i -> randomGenerate.generate())
                .collect(Collectors.toUnmodifiableList());

        // then
        assertThat(battings).hasSize(100);
        assertThat(battings).contains(Batting.STRIKE);
        assertThat(battings).contains(Batting.BALL);
        assertThat(battings).contains(Batting.HIT);

        log.info("### strike count ={}", battings.stream().filter(i -> i == Batting.STRIKE).count());
        log.info("### ball count={}", battings.stream().filter(i -> i == Batting.BALL).count());
        log.info("### hit count={}", battings.stream().filter(i -> i == Batting.HIT).count());
    }
}
