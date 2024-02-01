package day01_test

import (
	"aoc2015/solutions/day01"
	"testing"
)

var testCases = []struct {
	inp      string
	expected int
}{
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

func TestSolveInternal(t *testing.T) {
	for _, tc := range testCases {
		actual := day01.SolveInternal(tc.inp)
		if actual != tc.expected {
			t.Fatalf("inp='%s', expected='%d', actual='%d'", tc.inp, tc.expected, actual)
		}
	}
}
