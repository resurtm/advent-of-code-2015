package com.resurtm.aoc2015.day03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day03Solution {
    public void run() throws IOException {
        runInternal("github");
        runInternal("google");
    }

    private void runInternal(final String kind) throws IOException {
        final Stream<String> lines = Files.lines(Paths.get(
                String.format("../../input/day03/%s.txt", kind)
        ));
        final List<String> items = List.of(
                lines.collect(Collectors.joining("\n")).split("\n")
        );
        lines.close();

        final int part1 = solvePart1(items.getFirst());
        System.out.printf("Day 02, part 1, %s: %d\n", kind, part1);
    }

    int solvePart1(final String directions) {
        int posX = 0;
        int posY = 0;

        final Set<String> visited = new HashSet<>();
        visited.add(String.format("%d-%d", posX, posY));

        for (final Character direction : directions.toCharArray()) {
            switch (direction) {
                case '^':
                    posY--;
                    break;
                case 'v':
                    posY++;
                    break;
                case '<':
                    posX--;
                    break;
                case '>':
                    posX++;
                    break;
            }
            visited.add(String.format("%d-%d", posX, posY));
        }

        return visited.size();
    }
}
