package Sorting;
//https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1#
//Given an array Arr[] of size L and a number N, you need to write a program to find if
// there exists a pair of elements in the array whose difference is N.
import java.util.Arrays;

public class pairGivenDiff {
    public static void main(String[] args) {
        int[] arr={5,20,3,2,5,80};
        int n=60;
        System.out.println(findPair(arr,arr.length,n));
    }

    public static boolean findPair(int[] arr, int size, int n)
    {
        Arrays.sort(arr);  //2,3,5,5,20,80
        int i = 0;
        int j = 1;

        while (i<size && j<size) { //two checks are important otherwise indexoutofbound
            if (i != j && arr[j]-arr[i] == n) {
                return true;
            }
            else if (arr[j]-arr[i] < n)
                j++;
            else
                i++;
        }

        return false;
    }
}
