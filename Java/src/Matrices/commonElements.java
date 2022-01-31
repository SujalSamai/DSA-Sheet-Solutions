package Matrices;
//https://www.geeksforgeeks.org/common-elements-in-all-rows-of-a-given-matrix/
//Given an m x n matrix, find all common elements present in all rows in O(mn) time and one traversal of matrix.

import java.util.HashMap;

public class commonElements {
    public static void main(String[] args) {
        int[][] arr={{1, 2, 1, 4, 8},
                {3, 7, 8, 5, 1},
                {8, 7, 7, 3, 1},
                {8, 1, 2, 7, 9},
        };
        printCommonElements(arr);
    }
    static void printCommonElements(int[][] mat){
        int row=mat.length;
        int col= mat[0].length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        //imp: the key is the element and the value is the row number
        //value is row number because we don't want to count duplicacy of a value in a single row
        //we just want to count the value for once in a particular row

        for (int j = 0; j < col; j++){    //initialising the 1st row with elements as key and value as 1(row number)
            mp.put(mat[0][j],1);
        }

        // traverse the matrix
        for (int i = 1; i < row; i++)  //we don't need to traverse the first row, as we have already done that
        {
            for (int j = 0; j < col; j++)
            {
                //storing and avoiding duplicacy
                if(mp.containsKey(mat[i][j]) && mp.get(mat[i][j])==i){
                    mp.put(mat[i][j], mp.get(mat[i][j])+1);
                }
                if(i==row-1 && mp.containsKey(mat[i][j]) && mp.get(mat[i][j])==row){
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }
}
