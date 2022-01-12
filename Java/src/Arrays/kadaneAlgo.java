package Arrays;
//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
//https://leetcode.com/problems/maximum-subarray/
//Given an integer array nums, find the contiguous subarray (containing at least one number)
//which has the largest sum and return its sum. A subarray is a contiguous part of an array.
//Difficulty: Medium
public class kadaneAlgo {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    //Brute force approach- to check every subarray and find the max of that, o(n^2) or O(n^3)
    //So we use Kadane's algo -> O(n)
    //Concept- We traverse linearly and calculate the sum, whenever the sum gets negative, we discard that part and move on to next part
    static int maxSubArray(int[] nums){
        int maxSum=nums[0];
        int curSum=0;
        for (int i = 0; i < nums.length; i++) {
            curSum=curSum+nums[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }
}
