// https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
package main

import (
	"fmt"
)

func main() {
	array := []int{-12, 11, -13, -5, 6, -7, 5, -3, -6}
	negetiveSort(array)
	fmt.Println(array)
}

func negetiveSort(array []int) {
	start, end := 0, len(array)-1
	for start <= end {
		switch {
		case array[start] > 0 && array[end] < 0:
			array[start], array[end] = array[end], array[start]
		case array[start] > 0:
			end--
		case array[end] < 0:
			start++
		default:
			start++
			end--
		}
	}
}
