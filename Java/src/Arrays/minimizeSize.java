package Arrays;
//https://leetcode.com/problems/minimum-size-subarray-sum/
//Given an array of positive integers nums and a positive integer target, return the minimal length of a
// contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target.
// If there is no such subarray, return 0 instead.
public class minimizeSize {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target,arr));
    }
    //sliding window
    public static int minSubArrayLen(int target, int[] nums) {
        int ans= Integer.MAX_VALUE;
        int start=0;
        int end=1;
        int sum=nums[start];
        if(sum>=target) return 1;
        if(end<nums.length){ //if array has more than 2 elements
            sum+=nums[end];  //add the second element to the sum, so our window becomes of 2 elements
        }
        while(start<nums.length && end<nums.length){
            if(sum>=target){
                ans=Math.min(ans, end-start+1);
                sum-=nums[start];   //removing the first element and checking again, if ans holds true even after removing the first element
                start++;
            }
            else{
                end++;
                if(end<nums.length){  //if the ans is less than target, add next element
                    sum+=nums[end];
                }
            }
        }
        return (ans==Integer.MAX_VALUE)?0:ans;
    }
}
