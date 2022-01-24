package main

import "fmt"

func main() {
	word := []string{"h", "e", "l", "l", "o"}
	reverse_word := []string{}
	for i := 0; i < len(word); i++ {
		reverse_word = append(reverse_word, word[len(word)-1-i])
	}
	fmt.Println(reverse_word)
}
