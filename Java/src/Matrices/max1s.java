package Matrices;
//https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
//Given a boolean 2D array of n x m dimensions where each row is sorted.
// Find the 0-based index of the first row that has the maximum number of 1's.
public class max1s {
    public static void main(String[] args) {
        int[][] arr={{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}
        };
        int n= arr.length;
        int m= arr[0].length;
        System.out.println(rowWithMax1s(arr,n,m));
    }
    static int rowWithMax1s(int[][] arr, int n, int m) {
        int maxone = 0;
        int currentone = 0;
        int index=-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                currentone+=arr[i][j];  //sums the total in one row
                if(currentone>maxone){
                    maxone=currentone;  //stores the max sum from each row
                    index=i;
                }
            }
            currentone=0;
        }
        return index;
    }
}
