package Matrices;
//https://practice.geeksforgeeks.org/problems/sorted-matrix2333/1#
//Given an NxN matrix Mat. Sort all elements of the matrix.

import java.util.Arrays;

public class sortedMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
    }
    static int[][] sorted(int N, int Mat[][]) {
        // code here
        int[] arr= new int[N*N];
        int k=0;
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                arr[k++]=Mat[i][j];
            }
        }
        Arrays.sort(arr);
        k=0;
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                Mat[i][j]=arr[k++];
            }
        }
        return Mat;
    }
}
