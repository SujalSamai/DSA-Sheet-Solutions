package Arrays;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
//Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower
//either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer.
//Find out the minimum possible difference of the height of shortest and longest towers after you have modified each tower.
//Difficulty Level: Medium
public class minimizeHeights {
    public static void main(String[] args) {
        int[] arr= {1,5,8,10};
        System.out.println(getMinDiff(arr,4,2));
    }

    static int getMinDiff(int[] arr, int n, int k){
        Arrays.sort(arr);  //we sort the array, so as to make sure that the nearest element is the one which can minimise the difference
        //For eg: sorted arr=> {3,6,9,12,16,20} k=3, we take 3 and 16 randomly, the min. diff. will be 7 when (16-3)-(3+3)
        //But if we take 3 and 6, the min. diff. becomes 0

        int curAns= arr[n-1]- arr[0]; //Largest tower- Smallest tower
        int smallest= arr[0]+k;    //Value of the smallest tower
        int largest= arr[n-1]-k;   //Value of the largest tower
        int min, max;

        for (int i = 0; i < n-1; i++) {
            min= Math.min(smallest,arr[i+1]-k);  //checking if the current smallest number is smaller than the i+1 element
            max=Math.max(largest, arr[i]+k);     //checking if the current largest number is larger than the ith element
            if(min<0){
                continue;   //if our min is negative then we won't do max-min, as then it will increase mathematically
            }
            curAns= Math.min(curAns, max-min);  //updating the current ans, if the ans we got in the iteration is minimum than the prev. curAns
        }
        return curAns;
    }
}
