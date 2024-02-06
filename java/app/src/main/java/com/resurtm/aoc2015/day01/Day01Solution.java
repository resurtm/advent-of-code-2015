package com.resurtm.aoc2015.day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day01Solution {
    public void run() throws IOException {
        runInternal("github");
        runInternal("google");
    }

    private void runInternal(final String kind) throws IOException {
        final Stream<String> lines = Files.lines(Paths.get(
                String.format("../../input/day01/%s.txt", kind)
        ));
        final List<String> moves = List.of(
                lines.collect(Collectors.joining("\n")).split("\n")
        );
        lines.close();

        final int part1 = solvePart1(moves.getFirst());
        final int part2 = solvePart2(moves.getFirst());
        System.out.printf("Day 02, part 1, %s: %d\n", kind, part1);
        System.out.printf("Day 02, part 2, %s: %d\n", kind, part2);
    }

    int solvePart1(final String moves) {
        int level = 0;
        for (final Character ch : moves.toCharArray()) {
            switch (ch) {
                case '(':
                    level++;
                    break;
                case ')':
                    level--;
                    break;
            }
        }
        return level;
    }

    int solvePart2(final String moves) {
        int level = 0;
        int index = 0;
        for (final Character ch : moves.toCharArray()) {
            switch (ch) {
                case '(':
                    level++;
                    break;
                case ')':
                    level--;
                    break;
            }
            if (level == -1) {
                return index + 1;
            }
            index++;
        }
        return -1;
    }
}
