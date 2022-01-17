package Arrays;

//https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
//Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

import java.util.HashMap;

public class countPairs {
    public static void main(String[] args) {
        int[] arr={1,5,7,1};
        System.out.println(getPairsCount(arr,arr.length,6));
    }
    static int getPairsCount(int[] arr, int n, int k) {
//        int count=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[i]+arr[j]==k){
//                    count++;
//                }
//            }
//        }
//        return count;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int c=0;
        for(int x:arr){
            if(hm.containsKey(k-x)){  //containsKey checks if this key is present in HashMap
                c+=hm.get(k-x);       //get returns the object that contains the value associated with the key.
            }
            hm.put(x,hm.getOrDefault(x,0)+1);  //returns the value to which the specified key is mapped, or defaultValue if the map contains no mapping for the key.
        }
        return c;
    }
}
