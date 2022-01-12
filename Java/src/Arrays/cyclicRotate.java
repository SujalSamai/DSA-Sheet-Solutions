package Arrays;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
//Given an array, rotate the array by one position in clock-wise direction.
//Difficulty: Basic
public class cyclicRotate {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,4,2,1,3};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Taking two pointers, swapping both the pointers every time, while increasing the first pointer by one
    static void rotate(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
        }
    }
}
