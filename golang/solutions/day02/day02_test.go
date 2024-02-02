package day02_test

import (
	"aoc2015/solutions/day02"
	"testing"
)

type testCase struct {
	inp      string
	expected int
}

var testCases = []testCase{
	{"2x3x4", 58},
	{"1x1x10", 43},
}

func TestSolveInternalPart1(t *testing.T) {
	for _, tc := range testCases {
		actual, err := day02.SolveInternal([]string{tc.inp})
		if actual != tc.expected || err != nil {
			t.Fatalf("inp='%s', expected='%d', actual='%d', err='%v'", tc.inp, tc.expected, actual, err)
		}
	}
}
