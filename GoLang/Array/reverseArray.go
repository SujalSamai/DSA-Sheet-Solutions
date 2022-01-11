// https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
package main

import "fmt"

func main() {
	array := []int{1, 2, 3, 4, 5}
	fmt.Println(array)
	for start, end := 0, len(array)-1; start < end; start, end = start+1, end-1 { // for loop in go
		array[start], array[end] = array[end], array[start]
	}
	fmt.Println(array)
}
