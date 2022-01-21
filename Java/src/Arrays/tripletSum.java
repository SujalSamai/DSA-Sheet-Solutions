package Arrays;
//https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1
//Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.
import java.util.Arrays;
import java.util.Scanner;

public class tripletSum {
    public static void main(String[] args) {
        int[] arr={1,4,45,6,10,8};
        int x=13;
        System.out.println(find3Numbers(arr,arr.length,x));
//        Scanner sc= new Scanner(System.in);
//        int v= sc.nextInt();
    }
    //Simple two pointers approach
    public static boolean find3Numbers(int A[], int n, int X) {
        Arrays.sort(A);
        for (int i=0; i<n; i++){
            int low= i+1;
            int high= n-1;
            while (low<high){
                int sol= A[low]+ A[i]+ A[high];
                if(sol==X){
                    return true;
                }
                else if(sol>X){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return false;
    }
}
