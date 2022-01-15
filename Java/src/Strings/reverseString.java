package Strings;
//https://leetcode.com/problems/reverse-string/
//Write a function that reverses a string. The input string is given as an array of characters s.
//You must do this by modifying the input array in-place with O(1) extra memory.

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverse(s);
        System.out.println(Arrays.toString(s));
    }
    static void reverse(char[] s){
        int start=0;
        int end= s.length-1;
        while(start<end){
            char temp= s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}
