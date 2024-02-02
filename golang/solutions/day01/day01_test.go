package day01_test

import (
	"aoc2015/solutions/day01"
	"testing"
)

type testCase struct {
	inp      string
	expected int
}

var testCasesPart1 = []testCase{
	{"(())", 0},
	{"()()", 0},

	{"(((", 3},
	{"(()(()(", 3},

	{"))(((((", 3},

	{"())", -1},
	{"))(", -1},

	{")))", -3},
	{")())())", -3},
}

func TestSolveInternalPart1(t *testing.T) {
	for _, tc := range testCasesPart1 {
		actual, _ := day01.SolveInternal(tc.inp)
		if actual != tc.expected {
			t.Fatalf("inp='%s', expected='%d', actual='%d'", tc.inp, tc.expected, actual)
		}
	}
}

var testCasesPart2 = []testCase{
	{")", 1},
	{"()())", 5},
}

func TestSolveInternalPart2(t *testing.T) {
	for _, tc := range testCasesPart2 {
		_, actual := day01.SolveInternal(tc.inp)
		if actual != tc.expected {
			t.Fatalf("inp='%s', expected='%d', actual='%d'", tc.inp, tc.expected, actual)
		}
	}
}
