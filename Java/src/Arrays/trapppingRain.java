package Arrays;
//https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
//https://leetcode.com/problems/trapping-rain-water/
//Given an array arr[] of N non-negative integers representing the height of blocks.
// If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.

public class trapppingRain {
    public static void main(String[] args) {
        int[] arr={3,0,0,2,0,4};
        System.out.println(trappingWater(arr,arr.length));
    }
    //TC-O(N) SC- O(1)
    static long trappingWater(int[] arr, int n){
        long total = 0;
        int high1 = 0, high2 = 0;
        int l = 0, r = n-1;
        while(l<r)
        {
            if (arr[l] < arr[r]) {
                high1 = Math.max(high1, arr[l]);
                total += high1 - arr[l];
                l++;
            } else {
                high2 = Math.max(high2, arr[r]);
                total += high2 - arr[r];
                r--;
            }
        }
        return total;
    }

    //TC- O(3N) SC- O(2N)
    static long trapping(int[] arr, int n){
        int[] left= new int[n];
        int[] right= new int[n];
        left[0]= arr[0];
        for (int i=1; i<n; i++){
            left[i]= Math.max(left[i-1],arr[i]);
        }

        right[n-1]=arr[n-1];
        for (int i=n-2; i>=0; i--){
            right[i]=Math.max(right[i+1], arr[i]);
        }

        int ans=0;
        for (int i=0; i<n; i++){
            ans+=(Math.min(left[i],right[i])-arr[i]);
        }
        return ans;
    }
}
