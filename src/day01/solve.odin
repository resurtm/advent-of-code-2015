package day01

import "core:fmt"
import "core:os"

solve :: proc() {
	data, err := os.read_entire_file_or_err("./data/day01/gh.txt")
	if err != nil {
		fmt.eprintln("Cannot read data file:", err)
		return
	}
	fmt.println("Day 01, part 1:", solve_internal(string(data)))
}

solve_internal :: proc(inp: string) -> int {
	pos := 0
	for i := 0; i < len(inp); i += 1 {
		switch inp[i] {
		case '(':
			pos += 1
		case ')':
			pos -= 1
		}
	}
	return pos
}
