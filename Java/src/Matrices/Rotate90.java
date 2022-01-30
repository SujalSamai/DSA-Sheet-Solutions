package Matrices;
//https://www.geeksforgeeks.org/rotate-a-matrix-by-90-degree-in-clockwise-direction-without-using-any-extra-space/
//Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space.
import java.util.Arrays;

public class Rotate90 {
    public static void main(String[] args) {
        int[][] mat={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate90Clockwise(mat);
    }
    //we will first find the transpose of the matrix
    //then we will reverse the rows
    static void rotate90Clockwise(int[][] mat){
        //transpose of matrix
        for (int i=0; i<mat.length; i++){
            for (int j=i; j<mat[0].length; j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        //reverse the transposed matrix
        for (int i=0; i<mat.length; i++){
            int left=0;
            int right=mat[i].length-1;
            while (left<right){
                int temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                left++;
                right--;
            }
        }
        //display
        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
