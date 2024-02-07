package com.resurtm.aoc2015.day04

import kotlin.test.Test
import kotlin.test.assertEquals

class Day04Test {
    @Test
    fun `test part 1, case 1`() {
        val expected = 609043
        val actual = solvePart1("abcdef")
        assertEquals(expected, actual)
    }

    @Test
    fun `test part 1, case 2`() {
        val expected = 1048970
        val actual = solvePart1("pqrstuv")
        assertEquals(expected, actual)
    }
}
