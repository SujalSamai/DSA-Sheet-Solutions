//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
/*Given an array arr[] and an integer K where K is smaller than size of array,
        the task is to find the Kth smallest element in the given array.
        It is given that all array elements are distinct.*/

import java.util.Arrays;
import java.util.Scanner;

public class kthSmallest {
    public static void main(String[] args) {
        int[] arr={5, 8, 1, 21, 67, 45};
        Scanner sc= new Scanner(System.in);
        int k= sc.nextInt();
        System.out.println(kSmall(arr,k));
    }
    static int kSmall(int[] arr, int k){
        if(k>arr.length){
            return -1;
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
