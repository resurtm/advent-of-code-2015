package day02

import (
	"aoc2015/solutions/utils"
	"errors"
	"fmt"
	"strconv"
	"strings"
)

func SolveDay02() error {
	ghResPt1, err := solveInternal(utils.ReadInputData(2, "github"))
	if err != nil {
		return fmt.Errorf("cannot solve day 02 github: %w", err)
	}
	fmt.Printf("Day 02, Github, part 1: %d\n", ghResPt1)

	goResPt1, err := solveInternal(utils.ReadInputData(2, "google"))
	if err != nil {
		return fmt.Errorf("cannot solve day 02 google: %w", err)
	}
	fmt.Printf("Day 02, Google, part 1: %d\n", goResPt1)

	return nil
}

func solveInternal(inp []string) (int, error) {
	res := 0
	for _, box := range inp {
		if len(strings.TrimSpace(box)) == 0 {
			continue
		}

		a, b, c, err := parseBox(box)
		if err != nil {
			return 0, fmt.Errorf("cannot parse input: %w", err)
		}

		m, n, p := a*b, b*c, a*c
		res += 2*m + 2*n + 2*p

		if m <= n && m <= p {
			res += m
		} else if n <= m && n <= p {
			res += n
		} else if p <= m && p <= n {
			res += p
		}
	}
	return res, nil
}

func parseBox(boxStr string) (int, int, int, error) {
	parts := strings.Split(boxStr, "x")
	if len(parts) != 3 {
		return 0, 0, 0, errors.New("invalid box str, must contain exactly 3 values")
	}

	a, err := strconv.Atoi(parts[0])
	if err != nil {
		return 0, 0, 0, fmt.Errorf("invalid box str, cannot parse first value: %w", err)
	}

	b, err := strconv.Atoi(parts[1])
	if err != nil {
		return 0, 0, 0, fmt.Errorf("invalid box str, cannot parse second value: %w", err)
	}

	c, err := strconv.Atoi(parts[2])
	if err != nil {
		return 0, 0, 0, fmt.Errorf("invalid box str, cannot parse third value: %w", err)
	}

	return a, b, c, nil
}
