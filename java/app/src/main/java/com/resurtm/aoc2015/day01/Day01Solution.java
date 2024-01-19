package com.resurtm.aoc2015.day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
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
                String.format("../../input/day02/%s.txt", kind)
        ));
        final String presents = lines.collect(Collectors.joining("\n"));
        lines.close();

        final int part1 = solve(List.of(presents.split("\n")));
        System.out.printf("Day 02, part 1, %s: %d\n", kind, part1);
    }

    int solve(final Collection<String> presents) {
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
}
