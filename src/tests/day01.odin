package tests

import "../day01"
import "core:testing"

@(test)
test_part1_case0 :: proc(t: ^testing.T) {
	part1, _ := day01.solve_internal("(())")
	testing.expect_value(t, part1, 0)
}

@(test)
test_part1_case1 :: proc(t: ^testing.T) {
	part1, _ := day01.solve_internal("()()")
	testing.expect_value(t, part1, 0)
}

@(test)
test_part1_case2 :: proc(t: ^testing.T) {
	part1, _ := day01.solve_internal("(((")
	testing.expect_value(t, part1, 3)
}

@(test)
test_part1_case3 :: proc(t: ^testing.T) {
	part1, _ := day01.solve_internal("(()(()(")
	testing.expect_value(t, part1, 3)
}

@(test)
test_part1_case4 :: proc(t: ^testing.T) {
	part1, _ := day01.solve_internal("))(((((")
	testing.expect_value(t, part1, 3)
}

@(test)
test_part1_case5 :: proc(t: ^testing.T) {
	part1, _ := day01.solve_internal("())")
	testing.expect_value(t, part1, -1)
}

@(test)
test_part1_case6 :: proc(t: ^testing.T) {
	part1, _ := day01.solve_internal("))(")
	testing.expect_value(t, part1, -1)
}

@(test)
test_part1_case7 :: proc(t: ^testing.T) {
	part1, _ := day01.solve_internal(")))")
	testing.expect_value(t, part1, -3)
}

@(test)
test_part1_case8 :: proc(t: ^testing.T) {
	part1, _ := day01.solve_internal(")())())")
	testing.expect_value(t, part1, -3)
}

@(test)
test_part2_case1 :: proc(t: ^testing.T) {
	_, part2 := day01.solve_internal(")")
	testing.expect_value(t, part2, 1)
}

@(test)
test_part2_case2 :: proc(t: ^testing.T) {
	_, part2 := day01.solve_internal("()())")
	testing.expect_value(t, part2, 5)
}
