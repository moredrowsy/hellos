package main

import (
	"fmt"
	"os"
	"strings"
)

func main() {
	args := os.Args

	fmt.Printf("Hello,")

	if len(args) > 1 {

		for i := 1; i < len(args); i++ {
			fmt.Printf(" %s", strings.Title(args[i]))
		}
	} else {
		fmt.Print(" World")
	}

	fmt.Println("!")
}
