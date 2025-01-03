package tests

import "../day01"
import "core:testing"

@(test)
test_case0 :: proc(t: ^testing.T) {
	testing.expect_value(t, day01.solve_internal("(())"), 0)
}

@(test)
test_case1 :: proc(t: ^testing.T) {
	testing.expect_value(t, day01.solve_internal("()()"), 0)
}

@(test)
test_case2 :: proc(t: ^testing.T) {
	testing.expect_value(t, day01.solve_internal("((("), 3)
}

@(test)
test_case3 :: proc(t: ^testing.T) {
	testing.expect_value(t, day01.solve_internal("(()(()("), 3)
}

@(test)
test_case4 :: proc(t: ^testing.T) {
	testing.expect_value(t, day01.solve_internal("))((((("), 3)
}

@(test)
test_case5 :: proc(t: ^testing.T) {
	testing.expect_value(t, day01.solve_internal("())"), -1)
}

@(test)
test_case6 :: proc(t: ^testing.T) {
	testing.expect_value(t, day01.solve_internal("))("), -1)
}

@(test)
test_case7 :: proc(t: ^testing.T) {
	testing.expect_value(t, day01.solve_internal(")))"), -3)
}

@(test)
test_case8 :: proc(t: ^testing.T) {
	testing.expect_value(t, day01.solve_internal(")())())"), -3)
}
