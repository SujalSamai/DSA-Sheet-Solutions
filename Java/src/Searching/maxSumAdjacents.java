package Searching;
//https://practice.geeksforgeeks.org/problems/minimum-swaps/1#
//Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.
import java.util.Arrays;
import java.util.HashMap;

public class maxSumAdjacents {
    public static void main(String[] args) {
        int[] arr={2,8,5,4};
        System.out.println(minSwaps(arr,arr.length));
    }
    static int minSwaps(int[] arr, int n) {
        int[] a= new int[n];
        //copying the array
        for (int i = 0; i < n; i++) {
            a[i]=arr[i];
        }
        Arrays.sort(a); //sorting new arr
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i],i);   //putting the index element and mapping it to the index
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            //compares the given array with sorted array
            //if any differences in positions are found, it gets counted and then swapped
            //it works like this-> map.get(arr[1])-> arr[1]=8 -> map.get(8)->3 which is not equal to i which is 1
            while (map.get(arr[i])!=i){
                count++;
                //swapping so that 1 swap doesn't gets counted twice
                swap(arr,map.get(arr[i]),i);
            }
        }
        return count;
    }
    static void swap(int[] a,int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
