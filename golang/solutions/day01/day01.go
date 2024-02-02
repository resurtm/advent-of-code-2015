package day01

import (
	"aoc2015/solutions/utils"
	"fmt"
)

func SolveDay01() {
	ghRes := solveInternal(utils.ReadInputData(1, "github")[0])
	goRes := solveInternal(utils.ReadInputData(1, "google")[0])
	fmt.Printf("Day 01, Github, part 1: %d\n", ghRes)
	fmt.Printf("Day 01, Google, part 1: %d\n", goRes)
}

func solveInternal(inp string) int {
	level := 0
	for _, ch := range inp {
		switch ch {
		case '(':
			level++
		case ')':
			level--
		}
	}
	return level
}
