package main

import (
	"fmt"
	"sort"
)

func main() {
	word := []string{"h", "e", "l", "h", "h", "h", "l", "e", "h"}
	length := len(word)
	// count := 0
	sort.Strings(word)
	for i := 1; i < length; i++ {
		if word[i-1] == word[i] {
			var j int
			for j = i; j < length && word[j-1] == word[j]; j++ {

			}
			fmt.Println(word[i])
			i = j
		}

	}
}
