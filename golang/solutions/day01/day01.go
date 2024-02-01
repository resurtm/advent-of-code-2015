package day01

import "fmt"

func SolveDay01() {
	fmt.Println("Solve Day 01")
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
