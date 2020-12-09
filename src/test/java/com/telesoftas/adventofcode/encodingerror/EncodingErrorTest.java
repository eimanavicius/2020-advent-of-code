package com.telesoftas.adventofcode.encodingerror;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncodingErrorTest {

    private static final List<Long> SAMPLE = List.of(
        35L,
        20L,
        15L,
        25L,
        47L,
        40L,
        62L,
        55L,
        65L,
        95L,
        102L,
        117L,
        150L,
        182L,
        127L,
        219L,
        299L,
        277L,
        309L,
        576L
    );

    @Test
    void part1() {
        final Long erroneous = Day9.findEncryptionError(SAMPLE, 5);

        assertEquals(127, erroneous);
    }

    @Test
    void part2() {
        final Long erroneous = 127L;

        Set<Long> range = Day9.findEncryptionWeakness(SAMPLE, erroneous);
        final Optional<Long> min = range.stream().min(Long::compareTo);
        final Optional<Long> max = range.stream().max(Long::compareTo);

        assertEquals(62, min.get() + max.get());
    }
}