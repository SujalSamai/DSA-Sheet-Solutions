package Arrays;
//https://practice.geeksforgeeks.org/problems/find-the-median0527/1
//Given an array arr[] of N integers, calculate the median
import java.util.Arrays;

public class median {
    public static void main(String[] args) {

    }
    public int find_median(int[] v)
    {
        Arrays.sort(v);
        int n=v.length;
        if(n%2==0){
            return (v[(n/2)-1]+v[n/2])/2;
        }else{
            return v[n/2];
        }
    }
}
