package Arrays;

import java.util.HashSet;

//https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
/*Given two arrays a[] and b[] of size n and m respectively.
The task is to find union between these two arrays.*/
public class unionIntersection {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b= {1,2,3};
        System.out.println(Union(a,b));
    }
    //brute force - TLE
    static int Union(int[] a, int[] b){
        int count= a.length+ b.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j]){
                    count--;
                }
            }
        }
        return count;
    }
    //don't know
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        HashSet<Integer> set = new HashSet<>();

        int i=0,j=0;

        while(i<n || j<m){

            if(i<n)set.add(a[i]);
            if(j<m)set.add(b[j]);
            i++; j++;
        }

        return set.size();
    }
}
