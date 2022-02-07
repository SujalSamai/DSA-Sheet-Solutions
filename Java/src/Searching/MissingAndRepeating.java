package Searching;
//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1#
//Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and
// one number 'B' occurs twice in array. Find these two numbers.
import java.util.Arrays;
import java.util.HashMap;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[] arr={1,3,3};
        System.out.println(Arrays.toString(findTwoElement(arr, arr.length)));
    }
    static int[] findTwoElement(int[] arr, int n) {
        HashMap<Integer,Boolean> h=new HashMap<>();
        int[] ans=new int[2];
        int k=0;
        //first checking for repeating element
        for(int i:arr)
        {
            //get puts the elements as key and finds its value
            if(h.get(i)==null) {
                h.put(i, true);
                //at first attempt it will give 3 true, but at next attempt, it will find true already associated with 3
            }
            else {
                ans[k]=i;
                k++;
            }
        }
        //for missing element
        for(int i=1;i<=n;i++)
        {
            if(h.get(i)==null) {
                ans[k]=i;
                k++;
            }
        }
        return ans;
    }
}
