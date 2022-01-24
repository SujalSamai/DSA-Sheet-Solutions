//https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
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

func myAlgrothim(arr []int, k, n int) int {
	pArray, nArray := []int{}, []int{}
	for i := 0; i < n; i++ {
		pArray = append(pArray, arr[i]+k)
		nArray = append(nArray, arr[i]-k)
	}
	sort.Ints(pArray)
	sort.Ints(nArray)
	maxSum := min(nArray[n-1], pArray[n-1]) - max(nArray[0], pArray[0])
	return maxSum
}

// PS: This approch is similar to the one applied above.

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
