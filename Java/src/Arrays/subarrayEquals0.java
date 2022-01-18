package Arrays;

import java.util.HashMap;

//https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1
//Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
public class subarrayEquals0 {
    public static void main(String[] args) {
        int[] arr={4,2,-3,1,6};
        System.out.println(findSum(arr,arr.length));
    }

    //concept: curSum= (curSum-Sum)+Sum
    static boolean findSum(int[] arr,int n){
        int sum=0;
        int curSum=0;
        int start=0;
        int end=-1;
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i=0; i<n; i++){
            curSum+=arr[i];
            if(curSum-sum==0){   //if the subarray which has sum starts from index 0
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(curSum-sum)){
                start=map.get(curSum-sum)+1;   //get gives the value associated with curSum-Sum key
                end=i;
                break;
            }
            map.put(curSum,i);
        }
        if(end==-1){   //coz end is only updated when the sum if found in subarray
            return false;
        }else{
            return true;
        }
    }
}
