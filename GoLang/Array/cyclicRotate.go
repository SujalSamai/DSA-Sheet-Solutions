// https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
package main

import "fmt"

func main() {
	array := []int{1, 2, 3, 4, 5}
	rightShift(array)
	fmt.Println(array)
}

func leftShift(arr []int) {
	temp := arr[0]
	for i := 1; i < len(arr); i++ {
		arr[i-1] = arr[i]
	}
	arr[len(arr)-1] = temp
}
func rightShift(arr []int) {
	temp := arr[len(arr)-1]
	for i := len(arr) - 1; i > 0; i-- {
		arr[i] = arr[i-1]
	}
	arr[0] = temp
}

// my c++ soultion: https://practice.geeksforgeeks.org/viewSol.php?subId=c02790e7562a0abec3510009d42b4363&pid=703298&user=jammutkarsh
