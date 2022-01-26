package Arrays;
//https://practice.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together4847/1
//Given an array arr of n positive integers and a number k. One can apply a swap operation on the array any number of times, i.e choose any two index i and j (i < j) and swap arr[i] , arr[j] .
// Find the minimum number of swaps required to bring all the numbers less than or equal to k together, i.e. make them a contiguous subarray.

public class minSwapsK {
    public static void main(String[] args) {
        int[] arr={2, 7, 9, 5, 8, 7, 4};
        int k=6;
        System.out.println(minSwap(arr,arr.length,k));
    }

    //Sliding-Window algorithm
    //We will take a window of no. of elements<= k
    //One by one, we will add the next element and delete the first element from the window and check
    //the no. of elements >k, whenever the number of elements greater than k will be min. that will be the answer
    public static int minSwap (int arr[], int n, int k) {
        int favourable=0, nonFav=0;
        for (int i=0; i<n; i++){
            if(arr[i]<=k){
                favourable++;  //counting the number of elements which are <=k
            }
        }
        //this is our sliding window
        for (int j=0;j<favourable;j++){
            if(arr[j]>k){
                nonFav++;  //counting the number of elements that are greater than k in the first window
            }
        }
        //updating our window one by one
        int start=0, end=favourable-1, result=Integer.MAX_VALUE;
        while (end<n){
            result=Math.min(result,nonFav);
            end++;  //adding one element to the end of window
            if(end<n && arr[end]>k){
                nonFav++;  //again calculating the no. of elements > k in the new window
            }
            if(start<n && arr[start]>k){
                nonFav--;
            }
            start++;  //removing one element from the start of window
        }
        return (result==Integer.MAX_VALUE)?0:result;  //if array has only one element, return 0, else the result
    }
}
