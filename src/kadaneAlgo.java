/*https://leetcode.com/problems/maximum-subarray/
Given an integer array nums, find the contiguous subarray (containing at least one number)
which has the largest sum and return its sum.
A subarray is a contiguous part of an array.*/

public class kadaneAlgo {
    public static void main(String[] args) {
        int[] arr={-2,-5,-6,-3};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int cursum=0;
        for (int i = 0; i < nums.length; i++) {
            cursum= cursum+ nums[i];
            if(maxsum<cursum){
                maxsum=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        return maxsum;
    }
}
