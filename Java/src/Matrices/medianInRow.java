package Matrices;

import java.util.ArrayList;
import java.util.Collections;

//https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1
//Given a row wise sorted matrix of size RxC where R and C are always odd, find the median of the matrix.
public class medianInRow {
    public static void main(String[] args) {
        int[][] arr={
                {1,3,5},
                {2,6,9},
                {3,6,9}
        };
        int r= arr.length;
        int c=arr[0].length;
        System.out.println(median(arr,r,c));
    }
    static int median(int[][] matrix, int r, int c) {
        ArrayList<Integer> list= new ArrayList<>();
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(list.size()/2);
    }
}
