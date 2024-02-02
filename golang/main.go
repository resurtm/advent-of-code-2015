package main

import (
	"aoc2015/solutions/day01"
	"aoc2015/solutions/day02"
	"fmt"
)

func main() {
	day01.SolveDay01()
	fmt.Println("----------")
	if err := day02.SolveDay02(); err != nil {
		panic(err)
	}
}
