/*https://leetcode.com/problems/reverse-string/
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.*/
package Strings;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverse(s);
        System.out.println(Arrays.toString(s));
    }
    static void reverse(char[] s){
        int left=0;
        int right= s.length-1;
        while(right>left){
            char c=s[left];
            s[left]= s[right];
            s[right]=c;
            right--;
            left++;
        }
    }
}
