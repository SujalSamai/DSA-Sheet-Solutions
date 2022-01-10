package Arrays;
import java.util.Arrays;

public class minHeights {
    public static void main(String[] args) {
        int[] arr={5,8,2,9,3,4};
        System.out.println(getMinDiff(arr,arr.length,2));
    }

    /*
    https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1#
    Given an array arr[] denoting heights of N towers and a positive integer K,
    you have to modify the height of each tower either by increasing or decreasing them by K only once.
    After modifying, height should be a non-negative integer.
    Find out what could be the possible minimum difference of the height of shortest and
    longest towers after you have modified each tower.*/

    static int getMinDiff(int[] arr, int n, int k){
        Arrays.sort(arr);
        int ans = (arr[n - 1] + k) - (arr[0] + k); // Maximum possible height difference

        int tempmax = arr[n - 1] - k; // Maximum element when we subtract k from whole array
        int tempmin = arr[0] + k; // Minimum element when we add k to whole array
        int max, min;

        /*
          We know minimum value when we add k to whole array---> tempmin.
          So we need to find minimum element when we subtract k from whole array so while
          searching for minimum element {arr[i]-k} we should search from--->[1,arr.length-1] and
          similarly for maximum element we should search from---> [0,arr.length-2] so that we can check
          the height difference between all pairs of adjacent elements because adjacent elements will have
          small height difference as the array is a sorted one.
        */

        for (int i = 0; i < n - 1; i++) {
            max = Math.max(tempmax, arr[i] + k);
            min = Math.min(tempmin, arr[i + 1] - k);

            if (min >= 0) {
                ans = Math.min(ans, max - min);
            } else {
                min = arr[0] + k;
            }
        }
        return ans;
    }

    /*
    https://leetcode.com/problems/smallest-range-ii/
    You are given an integer array nums and an integer k.
    For each index i where 0 <= i < nums.length, change nums[i] to be either nums[i] + k or nums[i] - k.
    The score of nums is the difference between the maximum and minimum elements in nums.
    Return the minimum score of nums after changing the values at each index.*/
    static int smallestRangeII(int[] arr, int k) {
        int n= arr.length;
        Arrays.sort(arr);
        int max= arr[n-1];
        int min=arr[0];

        int ans= max-min;
        for (int i = 0; i <n-1; i++) {
            int a= arr[i];
            int b= arr[i+1];
            int high= Math.max(max-k,a+k);
            int low= Math.min(min+k, b-k);
            ans=Math.min(ans, high-low);
        }
        return ans;
    }

}
