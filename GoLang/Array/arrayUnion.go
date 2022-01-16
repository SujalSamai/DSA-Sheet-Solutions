package main

import "fmt"

func main() {
	arr := []int{1, 2, 3, 4, 5}
	arr2 := []int{1, 4, 5}
	fmt.Println(hashIntersection(arr, arr2))
}

func hashUnion(arr1 []int, arr2 []int) []int {
	union_array := []int{}
	max_1 := maxInArray(arr1)
	max_2 := maxInArray(arr2)
	hash_size := 0
	if max_1 > max_2 {
		hash_size = max_1
	} else {
		hash_size = max_2
	}
	// 5 is mentioned as hash_size cannot be placed there due to go limitations
	hash_table := [5 + 1]int{0}
	for i := 0; i < len(arr1); i++ {
		hash_table[arr1[i]]++
	}
	for i := 0; i < len(arr2); i++ {
		hash_table[arr2[i]]++
	}
	for i := 1; i <= hash_size; i++ {
		if hash_table[i] > 0 {
			union_array = append(union_array, i)
		}
	}
	return union_array
}

func hashIntersection(arr1 []int, arr2 []int) []int {
	intersection_array := []int{}
	hash_size := 0
	max_1 := maxInArray(arr1)
	max_2 := maxInArray(arr2)
	if max_1 > max_2 {
		hash_size = max_1
	} else {
		hash_size = max_2
	}
	// 5 is mentioned as hash_size cannot be placed there due to go limitations
	hash_table := [5 + 1]int{0}

	for i := 0; i < len(arr1); i++ {
		hash_table[arr1[i]]++
	}
	for i := 0; i < len(arr2); i++ {
		hash_table[arr2[i]]++
	}
	for i := 1; i <= hash_size; i++ {
		if hash_table[i] == 2 {
			intersection_array = append(intersection_array, i)
		}
	}
	return intersection_array
}

func maxInArray(a []int) (max int) {
	max = a[0]
	for _, value := range a {
		if value > max {
			max = value
		}
	}
	return max
}
