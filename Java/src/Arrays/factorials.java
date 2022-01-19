package Arrays;

import java.util.ArrayList;
//https://practice.geeksforgeeks.org/problems/factorials-of-large-numbers2508/1#
//Given an integer N, find its factorial.
public class factorials {
    public static void main(String[] args) {
        int n= 7;
        System.out.println(factorial(n));
    }
    static ArrayList<Integer> factorial(int N){
        //as we don't have a data type to store very-very large integers like 1000!, so we will store each number in an arraylist
        ArrayList<Integer> res = new ArrayList<>();
        int size=0, c=0;
        res.add(1);  //adding 1 at 0th index
        size=1; //updated size
        //we will traverse from 2 to N
        int val=2;
        while (val<=N){
            //Traverse array from right to left
            for (int i=size-1; i>=0;i--){
                //update value in arraylist
                int temp=res.get(i)*val+c;
                //store the last digit at index and remaining to carry
                res.set(i,temp%10);
                //update carry
                c=temp/10;
            }
            //insert carry digit by digit to the beginning of arraylist
            while(c!=0){
                res.add(0,c%10);
                c=c/10;
                size++;
            }
            val++;
        }
        return res;
    }
}
