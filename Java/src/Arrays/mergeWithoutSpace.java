package Arrays;

//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1
//Given two sorted arrays arr1[] of size N and arr2[] of size M.
// Each array is sorted in non-decreasing order.
// Merge the two arrays into one sorted array in non-decreasing order without using any extra space.
import java.util.Arrays;

public class mergeWithoutSpace {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={0,2,6,8,9};
        merge(arr1,arr2,4,5);
        System.out.println();
    }
    static void merge(int arr1[], int arr2[], int n, int m){
        int a= n-1;    //last element of first array
        int b= 0;      //first element of second array
        while(a>=0 && b<m){     //basically till the any of the array is not traversed completely
            if(arr1[a]>arr2[b]){    //element from last of arr1 is > element from start of arr2
                int temp= arr1[a];
                arr1[a]=arr2[b];
                arr2[b]=temp;
            }
            a--;
            b++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
