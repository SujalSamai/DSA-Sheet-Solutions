package Matrices;
//https://practice.geeksforgeeks.org/problems/kth-element-in-matrix/1#
//Given a N x N matrix, where every row and column is sorted in non-decreasing order. Find the kth smallest element in the matrix.
import java.util.Arrays;

public class kthSmallest {
    public static void main(String[] args) {
        int[][] arr={
                {16, 28, 60, 64},
                {22, 41, 63, 91},
                {27, 50, 87, 93},
                {36, 78, 87, 94}
        };
        int k=3;
        System.out.println(kSmallest(arr,arr.length,k));
    }

    public static int kSmallest(int[][]mat,int n,int k)
    {
        int[] arr= new int[n*n];
        int index=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[index++]=mat[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
