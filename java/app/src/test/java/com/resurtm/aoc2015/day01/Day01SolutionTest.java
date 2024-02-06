package com.resurtm.aoc2015.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Day01SolutionTest {
    @ParameterizedTest
    @MethodSource("provideTestSolvePart1Cases")
    public void testSolvePart1(final int expected, final String moves) {
        final int actual = (new Day01Solution()).solvePart1(moves);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestSolvePart1Cases() {
        return Stream.of(
                Arguments.of(0, "(())"),
                Arguments.of(0, "()()"),
                Arguments.of(3, "((("),
                Arguments.of(3, "(()(()("),
                Arguments.of(3, "))((((("),
                Arguments.of(-1, "())"),
                Arguments.of(-1, "))("),
                Arguments.of(-3, ")))"),
                Arguments.of(-3, ")())())")
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestSolvePart2Cases")
    public void testSolvePart2(final int expected, final String moves) {
        final int actual = (new Day01Solution()).solvePart2(moves);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestSolvePart2Cases() {
        return Stream.of(
                Arguments.of(1, ")"),
                Arguments.of(5, "()())")
        );
    }
}
