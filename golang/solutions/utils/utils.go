package utils

import (
	"fmt"
	"os"
	"strings"
)

func ReadInputData(day uint, variant string) []string {
	res, err := os.ReadFile(fmt.Sprintf("../input/day%02d/%s.txt", day, variant))
	if err != nil {
		panic(err)
	}
	return strings.Split(string(res), "\n")
}
