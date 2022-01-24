package main

import "fmt"

func main() {
	word := []string{"h", "e", "l", "k", "l", "e", "h"}
	length := len(word)
	count := 0
	for i := 0; i < length/2; i++ {
		if word[i] == word[length-i-1] {
			count++
		}
	}
	if count == length/2 {
		fmt.Println("1")
	} else {
		fmt.Println("0")
	}
}
