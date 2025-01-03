package day01

import "core:fmt"
import "core:os"

solve :: proc() {
	data, err := os.read_entire_file_or_err("./data/day01/gh.txt")
	if err != nil {
		fmt.eprintln("Cannot read data file:", err)
		return
	}
	part1, part2 := solve_internal(string(data))
	fmt.println("Day 01, part 1:", part1)
	fmt.println("Day 01, part 2:", part2)
}

solve_internal :: proc(inp: string) -> (int, int) {
	pos, basement := 0, -1
	for i := 0; i < len(inp); i += 1 {
		switch inp[i] {
		case '(':
			pos += 1
		case ')':
			pos -= 1
		}
		if pos == -1 && basement == -1 {
			basement = i + 1
		}
	}
	return pos, basement
}
