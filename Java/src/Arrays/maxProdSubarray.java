package Arrays;
//https://leetcode.com/problems/maximum-product-subarray/
//Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
public class maxProdSubarray {
    public static void main(String[] args) {
        int[] arr={3,-1,4};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        int ans= Integer.MIN_VALUE;
        int prod=1;
        for (int i=0; i<nums.length; i++){
            prod=prod*nums[i];
            ans= Math.max(ans,prod);
            if(prod==0){
                prod=1;
            }
        }
        //we have to check from last too, because in case such as [3,-1,4], 4 is actual answer, but if we only loop from beiginning
        //then our answer will be 3
        prod=1;
        for (int i=nums.length-1; i>=0; i--){
            prod=prod*nums[i];
            ans= Math.max(ans,prod);
            if(prod==0){
                prod=1;
            }
        }
        return ans;
    }
}
