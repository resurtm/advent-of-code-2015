package com.resurtm.aoc2015.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Day03SolutionTest {
    @ParameterizedTest
    @MethodSource("provideTestSolvePart1Cases")
    public void testSolvePart1(final int expected, final String directions) {
        final int actual = (new Day03Solution()).solvePart1(directions);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestSolvePart1Cases() {
        return Stream.of(
                Arguments.of(2, ">"),
                Arguments.of(4, "^>v<"),
                Arguments.of(2, "^v^v^v^v^v")
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestSolvePart2Cases")
    public void testSolvePart2(final int expected, final String directions) {
        final int actual = (new Day03Solution()).solvePart2(directions);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestSolvePart2Cases() {
        return Stream.of(
                Arguments.of(3, "^v"),
                Arguments.of(3, "^>v<"),
                Arguments.of(11, "^v^v^v^v^v")
        );
    }
}
