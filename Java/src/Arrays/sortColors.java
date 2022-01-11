package Arrays;
//https://leetcode.com/problems/sort-colors/
//Given an array nums with n objects colored red, white, or blue, sort them in-place so
//that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.

import java.util.Arrays;

//Variation of Dutch National FLag Algorithm
public class sortColors {
    public static void main(String[] args) {
        int[] nums= {2,0,2,1,1,0};
        sortCol(nums);
        System.out.println(Arrays.toString(nums));
    }

    //Rules: We will take three variables low, mid and high
    //We will push all the 0s at the left of low and all the 2s at right of high
    public static void sortCol(int[] nums) {
        int low=0;
        int mid= 0;
        int high= nums.length-1;
        while(mid<=high){
            if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==0){
                int temp=nums[low];    //swapping low and mid
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }else if(nums[mid]==2){
                int temp=nums[high];   //swapping high and mid
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;                //did not changed mid because, once we swap high and mid. mid can have 0 or 1
            }
        }
    }
}
