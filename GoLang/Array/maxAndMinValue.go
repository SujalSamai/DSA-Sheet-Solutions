// https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
package main

import (
	"fmt"
	"sort"
)

func main() {
	array := []int{1, 5, 6, 8, 3, 4, 7, 2, 9}
	{
		min, max := loopSort(array)
		fmt.Println("Min: ", min)
		fmt.Println("Max: ", max)
	}
	// Or
	{
		min, max := sortFunc(array)
		fmt.Println("Min: ", min)
		fmt.Println("Max: ", max)
	}
	// fmt.Println(array)

}

func loopSort(arr []int) (int, int) {
	min, max := arr[0], arr[0]
	for i := 0; i < len(arr); i++ {
		if min > arr[i] {
			min = arr[i]
		}
		if min < arr[i] {
			max = arr[i]
		}
	}
	return min, max
}
func sortFunc(arr []int) (int, int) {
	sort.Ints(arr) // Due to this function, the array will be sorted ; uncomment line 22;
	return arr[0], arr[len(arr)-1]
}
