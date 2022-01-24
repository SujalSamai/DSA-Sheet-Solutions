// https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
package main

import "fmt"

func main() {
	array := []int{-1, -2, -3, -4}
	fmt.Println(kadane(array))
}

func kadane(arr []int) int {
	currentSum := 0
	maxSum := arr[0]
	for i := 0; i < len(arr); i++ {
		currentSum += arr[i]
		if currentSum > maxSum {
			maxSum = currentSum
		}
		if currentSum < 0 {
			currentSum = 0
		}
	}
	return maxSum
}
