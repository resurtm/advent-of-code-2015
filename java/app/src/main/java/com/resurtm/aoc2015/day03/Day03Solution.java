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
        final int part2 = solvePart2(items.getFirst());
        System.out.printf("Day 02, part 1, %s: %d\n", kind, part1);
        System.out.printf("Day 02, part 2, %s: %d\n", kind, part2);
    }

    int solvePart1(final String directions) {
        int posX = 0;
        int posY = 0;

        final Set<String> visited = new HashSet<>();

        for (final Character direction : directions.toCharArray()) {
            visited.add(String.format("%d-%d", posX, posY));
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
        }

        visited.add(String.format("%d-%d", posX, posY));
        return visited.size();
    }

    int solvePart2(final String directions) {
        int pos1X = 0;
        int pos1Y = 0;

        int pos2X = 0;
        int pos2Y = 0;

        boolean robo = false;

        final Set<String> visited = new HashSet<>();

        for (final Character direction : directions.toCharArray()) {
            if (robo) {
                visited.add(String.format("%d-%d", pos1X, pos1Y));
                switch (direction) {
                    case '^':
                        pos1Y--;
                        break;
                    case 'v':
                        pos1Y++;
                        break;
                    case '<':
                        pos1X--;
                        break;
                    case '>':
                        pos1X++;
                        break;
                }
            } else {
                visited.add(String.format("%d-%d", pos2X, pos2Y));
                switch (direction) {
                    case '^':
                        pos2Y--;
                        break;
                    case 'v':
                        pos2Y++;
                        break;
                    case '<':
                        pos2X--;
                        break;
                    case '>':
                        pos2X++;
                        break;
                }
            }
            robo = !robo;
        }

        visited.add(String.format("%d-%d", pos1X, pos1Y));
        visited.add(String.format("%d-%d", pos2X, pos2Y));
        return visited.size();
    }
}
