package Arrays;
//https://leetcode.com/problems/find-the-duplicate-number/
//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums and uses only constant extra space.
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicateNumber {
    public static void main(String[] args) {
        int[] arr= {3,1,3,4,2};
        System.out.println(findDuplicateOpt(arr));
    }

    //nlogn
    static int findDuplicate(int[] nums){
        int n= nums.length-1;
        Arrays.sort(nums);
        for (int i = 0; i <= n; i++) {
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }

    //optimised solution- O(n)
    static int findDuplicateOpt(int[] nums){
        Set<Integer> s= new HashSet<>();
        for (int i:nums){
            if(s.contains(i)){
                return i;
            }
            s.add(i);
        }
        return -1;
    }
}
