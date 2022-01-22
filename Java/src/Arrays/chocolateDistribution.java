package Arrays;
//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
//Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet.
// Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets
// among M students such that :
//1. Each student gets exactly one packet.
//2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class chocolateDistribution {
    public static void main(String[] args) {
        ArrayList<Long> arr=new ArrayList<Long>(){
            {
                add(3L);
                add(4L);
                add(1L);
                add(9L);
                add(56L);
                add(7L);
                add(9L);
                add(12L);
            }
        };
        int m=5;
        System.out.println(findMinDiff(arr,arr.size(),m));
    }

    public static long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        Collections.sort(a);
        long min=100000000;
        for (int i=0; i<=n-m;i++){
            if((a.get((int)m-1+i)-a.get(i))<min){
                min=a.get((int)m-1+i)-a.get(i);
            }
        }
        return min;
    }
}
