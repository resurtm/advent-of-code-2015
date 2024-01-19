package com.resurtm.aoc2015.day01;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01SolutionTest {
    @Test
    public void testSolveCase1() {
        final Collection<String> presents = Collections.singletonList("2x3x4");
        final Integer actual = (new Day01Solution()).solve(presents);
        assertEquals(58, actual);
    }

    @Test
    public void testSolveCase2() {
        final Collection<String> presents = Collections.singletonList("1x1x10");
        final Integer actual = (new Day01Solution()).solve(presents);
        assertEquals(43, actual);
    }
}
