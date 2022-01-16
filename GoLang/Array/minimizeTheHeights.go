package main

import (
	"fmt"
	"sort"
)

func main() {
	arr := []int{1, 8, 5, 10}
	k := 2
	fmt.Println(minHeight(arr, k, len(arr)))
}

func minHeight(arr []int, k, n int) int {
	sort.Ints(arr)
	max_ := arr[n-1]
	min_ := arr[0]
	result := max_ - min_
	for i := 1; i < n; i++ {
		max_ = max(arr[i-1]+k, arr[n-1]-k)
		min_ = min(arr[i]-k, arr[0]+k)
		result = min(result, max_-min_)
	}
	return result
}

func max(x, y int) int {
	if x < y {
		return y
	}
	return x
}

func min(x, y int) int {
	if x > y {
		return y
	}
	return x
}
