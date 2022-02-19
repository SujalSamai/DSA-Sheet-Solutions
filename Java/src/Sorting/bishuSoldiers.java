package Sorting;
//https://www.hackerearth.com/problem/algorithm/bishu-and-soldiers-227/
//Bishu went to fight for Coding Club. There were N soldiers with various powers.
// There will be Q rounds to fight and in each round, Bishu's power will be varied.
// With power M, Bishu can kill all the soldiers whose power is less than or equal to M(<=M).
// After each round, All the soldiers who are dead in the previous round will reborn.
// Such that in each round there will be N soldiers to fight. As Bishu is weak in mathematics,
// help him to count the number of soldiers that he can kill in each round and the total sum of their powers.
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bishuSoldiers {
//    n*q solution simple af
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n= sc.nextInt();
//        int[] arr= new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i]= sc.nextInt();
//        }
//        int q= sc.nextInt();
//        while (q>0){
//            int power= sc.nextInt();
//            int count=0;
//            int sum=0;
//            for (int i=0; i<n; i++){
//                if(arr[i]<=power){
//                    count++;
//                    sum+=arr[i];
//                }
//            }
//            System.out.println(count + " " + sum);
//            q--;
//        }
//    }

// nlogn solution also simple af
    static int bs(int[] arr , int n , int k){
        if(arr[n-1] <= k)
            return n;
        if(arr[0] > k)
            return 0;
        int lo = 0;
        int hi = n-1;
        int mid;
        while(lo<=hi){
            mid = (lo+hi)/2;
            if(arr[mid] == k && arr[mid+1] > k) return mid+1;
            if(arr[mid] <= k )
                lo = mid+1;
            else hi = mid-1;
        }
        return 0;
    }
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n+1];
        for(int i=0 ; i<n ; i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1 ; i<=n ; i++){
            res[i] += res[i-1] + arr[i-1];
        }
        int k = s.nextInt();
        while(k-->0){
            int p = s.nextInt();
            int ans = bs(arr,n,p);
            int r=0;
            if(ans>0){
                r= res[ans];
            }
            System.out.println(ans+" "+r);
        }
    }
}
