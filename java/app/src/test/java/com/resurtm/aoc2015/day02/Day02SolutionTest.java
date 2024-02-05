package com.resurtm.aoc2015.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.Collections;
import org.junit.jupiter.api.Test;

public class Day02SolutionTest {
    @Test
    public void testSolveCase1() {
        final Collection<String> presents = Collections.singletonList("2x3x4");
        final Integer actual = (new Day02Solution()).solvePart1(presents);
        assertEquals(58, actual);
    }

    @Test
    public void testSolveCase2() {
        final Collection<String> presents = Collections.singletonList("1x1x10");
        final Integer actual = (new Day02Solution()).solvePart1(presents);
        assertEquals(43, actual);
    }

    @Test
    public void testSolveCase3() {
        final Collection<String> presents = Collections.singletonList("2x3x4");
        final Integer actual = (new Day02Solution()).solvePart2(presents);
        assertEquals(34, actual);
    }

    @Test
    public void testSolveCase4() {
        final Collection<String> presents = Collections.singletonList("1x1x10");
        final Integer actual = (new Day02Solution()).solvePart2(presents);
        assertEquals(14, actual);
    }
}
