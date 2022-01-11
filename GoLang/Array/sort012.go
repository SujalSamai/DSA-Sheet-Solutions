package main

import (
	"fmt"
)

func main() {
	array := []int{1, 0, 2, 1, 1, 0, 2, 2, 1}
	{ // By using sort function
		// sort.Ints(array)
		// fmt.Println(array)
	}
	// or
	hashSort(array)
}
func hashSort(arr []int) []int {
	hash, sorted_array := [3]int{0}, []int{}

	for i := 0; i < len(arr); i++ { // finding the no. of 0,1,2 in the array ; counting them in a has table.
		hash[arr[i]]++
	}
	// appending the data according to hash table.
	for i := 0; i < len(hash); i++ { // to iterate over each elemet like 0,1,2
		for j := 0; j < hash[i]; j++ { // to append add them in the
			sorted_array = append(sorted_array, i)
		}
	}
	fmt.Println(sorted_array)
	return arr
}
