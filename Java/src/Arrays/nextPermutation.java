package Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/next-permutation/
//Given an array of integers nums, find the next permutation of nums.
//The replacement must be in place and use only constant extra memory.
public class nextPermutation {
    public static void main(String[] args) {
        int[] nums={1,3,5,4,2};
        permutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    //algorithm:-
    //1. Start from the last index and traverse and find where a[i]<a[i+1]
    //2.Now again traverse from the back and check which index which has greater value than the ith index
    //3. Swap both the indexes we found
    //4. Reverse everything to the right of index[i+1]
    public static void permutation(int[] nums) {
        if(nums==null || nums.length<=1){
            return;
        }
        int i=nums.length-2;   //the breakpoint can start only from second last index
        while (i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //i will contain the breakpoint number index
        if(i>=0){  //if there is no breakpoint this is not performed
            int j=nums.length-1;
            while (nums[j]<=nums[i]){  //checking the right side elements for the next index having greater value than i
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums, i+1,nums.length-1); //reverse right half
    }

    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr, int i, int j){
        while (i<j){
            swap(arr,i++,j--);
        }
    }
}
