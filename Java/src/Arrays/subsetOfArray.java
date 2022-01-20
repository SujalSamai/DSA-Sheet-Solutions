package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

//https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
//Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not.
//Both the arrays can be sorted or unsorted. It may be assumed that elements in both array are distinct.
public class subsetOfArray {
    public static void main(String[] args) {
        long[] a1={11,1,13,21,3,7};
        long[] a2={11,3,7,2};
        System.out.println(isSubset(a1,a2,a1.length,a2.length));
    }
    public static String isSubset( long[] a1, long[] a2, long n, long m) {
        ArrayList<Long> list= new ArrayList<>();
        for(long l:a1){
            list.add(l);
        }
        for(int i=0; i<m; i++){
            if(!list.contains(a2[i])){
                return "No";
            }
        }
        return "Yes";
    }
}
