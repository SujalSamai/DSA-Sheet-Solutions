package Matrices;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
//Given a matrix of size r*c. Traverse the matrix in spiral form.
public class spiralTraversal {
    public static void main(String[] args) {
        int[] [] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(spirallyTraverse(arr,arr.length,arr[0].length));
    }
    static ArrayList<Integer> spirallyTraverse(int[][] matrix, int r, int c)
    {
        ArrayList<Integer> spiral= new ArrayList<>();
        //creating four pointers, which points at four corners of matrix
        int startRow=0;
        int endRow= r-1;
        int startCol=0;
        int endCol=c-1;
        //we will first print the first row, then the last column, then the last row and then the first column
        //then we will print second low,second last col, second last row and second col and so on..
        while (startRow<=endRow && startCol<=endCol){
            //first row
            for (int i= startCol; i<=endCol; i++){
                spiral.add(matrix[startRow][i]);
            }
            startRow++;
            //ending column
            for (int i= startRow; i<=endRow; i++){
                spiral.add(matrix[i][endCol]);
            }
            endCol--;

            if(startRow<=endRow){
                for (int i= endCol; i>=startCol; i--){
                    spiral.add(matrix[endRow][i]);
                }
                endRow--;
            }
            if(startCol<=endCol){
                for (int i= endRow; i>=startRow; i--){
                    spiral.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }
        return spiral;
    }
}
