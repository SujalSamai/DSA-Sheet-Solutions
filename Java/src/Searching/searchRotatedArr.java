package Searching;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class searchRotatedArr {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }
    //rotated binary search
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            boolean leftsorted = isSorted(nums,start,mid);// checks if left part(including mid elem) is sorted or not

            if(leftsorted)
            {
                if(target>=nums[start] && target<nums[mid])// target lies in the sorted left half
                    end = mid - 1;
                else
                    start = mid+1; // target lies in the unsorted right half
            }
            else //right sorted
            {
                if(target>nums[mid] && target<=nums[end]) //target lies in the sorted-right part
                    start = mid+1;
                else
                    end = mid-1; // target lies in the unsorted left part
            }
        }
        return -1;
    }
    static boolean isSorted(int nums[],int start,int mid)
    {
        if(nums[start]<=nums[mid])
            return true;
        else
            return false;
    }
}
