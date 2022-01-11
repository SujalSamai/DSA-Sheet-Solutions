// https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
package main

import (
	"fmt"
	"sort"
)

func main() {
	array := []int{1, 5, 6, 8, 3, 4, 7, 2, 9}
	k := 3
	fmt.Println("Min: ", kMin(k, array))
}
func kMin(k int, arr []int) int {
	sort.Ints(arr)
	return arr[k-1]
}
func kMax(k int, arr []int) int {
	sort.Ints(arr)
	return arr[len(arr)-k]
}
