package com.resurtm.aoc2015.day01;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Day01Solution {
    public void run() {

    }

    Integer solve(final Collection<String> presents) {
        int result = 0;
        for (final String present : presents) {
            final List<Integer> dimensions = Arrays.stream(present.split("x"))
                    .map(x -> Integer.parseInt(x, 10))
                    .toList();
            final Integer l = dimensions.get(0);
            final Integer w = dimensions.get(1);
            final Integer h = dimensions.get(2);
            result += 2 * l * w + 2 * w * h + 2 * h * l + l * w;
        }
        return result;
    }
}
