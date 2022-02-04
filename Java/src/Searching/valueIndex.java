package Searching;
//https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1#
//Given an array Arr of N positive integers.
// Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).
import java.util.ArrayList;

public class valueIndex {
    public static void main(String[] args) {
        int[] arr={15,2,45,12,7};
        System.out.println(valueEqualToIndex(arr,arr.length));
    }
    static ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        ArrayList<Integer> list= new ArrayList<>();
        for (int i=0; i<n; i++){
            if(i+1==arr[i]){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
