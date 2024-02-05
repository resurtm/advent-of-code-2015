package com.resurtm.aoc2015;

import com.resurtm.aoc2015.day02.Day02Solution;
import com.resurtm.aoc2015.day03.Day03Solution;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        (new Day02Solution()).run();
        System.out.println("----------");
        (new Day03Solution()).run();
    }
}
