package Arrays;
//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
//https://leetcode.com/problems/kth-largest-element-in-an-array/
//Given an array arr[] and an integer K where K is smaller than size of array,
// the task is to find the Kth smallest and largest element in the given array.
// It is given that all array elements are distinct.
//Difficulty level: Medium

import java.util.Arrays;

public class kthMaxMin {
    public static void main(String[] args) {
        int[] arr={7,2,8,32,67,12,46};
        int k= 4;
        System.out.println("kth Largest number in this array is: "+ kthLargest(arr,k));
        System.out.println("kth Smallest number in this array is: "+ kthSmallest(arr,k));
    }

    //although array indexes start from 0, the count for k will neglect zero
    //Sorted array will be: {2,7,8,12,32,46,67}
    static int kthLargest(int[] arr, int k){
        Arrays.sort(arr);    //Arrays.sort uses Quick Sort(Dual Pivot) in Java
        return arr[arr.length-(k)];
    }

    static int kthSmallest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}
