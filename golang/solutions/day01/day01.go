package day01

import (
	"aoc2015/solutions/utils"
	"fmt"
)

func SolveDay01() {
	ghResPt1, ghResPt2 := solveInternal(utils.ReadInputData(1, "github")[0])
	fmt.Printf("Day 01, Github, part 1: %d\n", ghResPt1)
	fmt.Printf("Day 01, Github, part 2: %d\n", ghResPt2)

	goResPt1, goResPt2 := solveInternal(utils.ReadInputData(1, "google")[0])
	fmt.Printf("Day 01, Google, part 1: %d\n", goResPt1)
	fmt.Printf("Day 01, Google, part 2: %d\n", goResPt2)
}

func solveInternal(inp string) (int, int) {
	level, first := 0, -1
	for pos, ch := range inp {
		switch ch {
		case '(':
			level++
		case ')':
			level--
		}
		if level == -1 && first == -1 {
			first = pos
		}
	}
	return level, first + 1
}
