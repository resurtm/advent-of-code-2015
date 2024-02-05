package com.resurtm.aoc2015.day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day02Solution {
    public void run() throws IOException {
        runInternal("github");
        runInternal("google");
    }

    private void runInternal(final String kind) throws IOException {
        final Stream<String> lines = Files.lines(Paths.get(
                String.format("../../input/day02/%s.txt", kind)
        ));
        final List<String> presents = List.of(
                lines.collect(Collectors.joining("\n")).split("\n")
        );
        lines.close();

        final int part1 = solvePart1(presents);
        final int part2 = solvePart2(presents);
        System.out.printf("Day 02, part 1, %s: %d\n", kind, part1);
        System.out.printf("Day 02, part 2, %s: %d\n", kind, part2);
    }

    int solvePart1(final Collection<String> presents) {
        int result = 0;
        for (final String present : presents) {
            final List<Integer> dimensions = Arrays.stream(present.split("x"))
                    .map(x -> Integer.parseInt(x, 10))
                    .toList();

            int l = dimensions.get(0);
            int w = dimensions.get(1);
            int h = dimensions.get(2);

            int a = l * w;
            int b = w * h;
            int c = h * l;

            if (a <= b && a <= c) {
                result += a;
            } else if (b <= a && b <= c) {
                result += b;
            } else if (c <= a && c <= b) {
                result += c;
            }
            result += 2 * a + 2 * b + 2 * c;
        }
        return result;
    }

    int solvePart2(final Collection<String> presents) {
        int result = 0;
        for (final String present : presents) {
            final List<Integer> dimensions = Arrays.stream(present.split("x"))
                    .map(x -> Integer.parseInt(x, 10))
                    .sorted()
                    .toList();

            int a = dimensions.get(0);
            int b = dimensions.get(1);
            int c = dimensions.get(2);

            result += 2 * a + 2 * b + a * b * c;
        }
        return result;
    }
}
