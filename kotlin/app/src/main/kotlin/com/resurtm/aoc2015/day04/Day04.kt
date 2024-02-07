package com.resurtm.aoc2015.day04

import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

fun solveDay04() {
    runInternal("github")
    runInternal("google")
}

private fun runInternal(kind: String) {
    val lines = File("../../input/day04/$kind.txt").readLines()
    val part1 = solvePart1(lines.first())
    println("Day 04, part 1, $kind: $part1")
}

internal fun solvePart1(secretKey: String): Int {
    val md = MessageDigest.getInstance("MD5")
    var res = 0
    while (true) {
        val hashVal = "$secretKey$res"
        val hash = BigInteger(1, md.digest(hashVal.toByteArray()))
            .toString(16)
            .padStart(32, '0')
        if (hash.startsWith("00000")) {
            return res
        }
        res++
    }
}
