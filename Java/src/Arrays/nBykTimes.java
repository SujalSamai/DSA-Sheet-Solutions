package Arrays;
//https://www.geeksforgeeks.org/given-an-array-of-of-size-n-finds-all-the-elements-that-appear-more-than-nk-times/
//https://leetcode.com/problems/majority-element-ii/
//Given an array of size n and a number k, find all elements that appear more than n/k times

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class nBykTimes {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        int k=3;
        System.out.println(moreThanNbyK(arr,arr.length,k));
    }
    //Time Complexity & Space Complexity- O(n)
    static List<Integer> moreThanNbyK(int[] a,int n, int k){
        List<Integer> ans= new ArrayList<>();
        int x= n/k;
        HashMap<Integer,Integer> map= new HashMap<>();
        int counter=0;
        for(int i=0; i<n; i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);   //getOrDefault first takes the key which we are checking, and returns its value, if not found any value, it gives the default value
        }
        //Map.Entry=> Provides method to access key and values and map.entrySet() converts it to set
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){  //used to traverse the map
            if(entry.getValue()>x){
//                counter++;
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
