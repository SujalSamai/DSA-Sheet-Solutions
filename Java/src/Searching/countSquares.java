package Searching;
//https://practice.geeksforgeeks.org/problems/count-squares3649/1#
//Consider a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on.
// You are given a number N, you have to output the number of integers less than N in the sample space S.
public class countSquares {
    public static void main(String[] args) {
        int N=3;
        System.out.println(countSq(N));
    }

    static int countSq(int N){
        int count=0;
        for (int i=1; i*i<=N; i++){
            if(i*i<N){
                count++;
            }
        }
        return count;
    }
}
