package Strings;

import java.util.Locale;

/*https://practice.geeksforgeeks.org/problems/palindrome-string0817/1
Given a string S, check if it is palindrome or not.
*/
public class palindrome {
    public static void main(String[] args) {
        String name="Kanak";
        System.out.println(isPalindrome(name));
    }
    static int isPalindrome(String S) {
        String reverse="";
        int n= S.length();
        for (int i = n-1; i >= 0; --i) {
            reverse=reverse + S.charAt(i);
        }
        if(S.toLowerCase().equals(reverse.toLowerCase())){
            return 1;
        }
        return 0;
    }
}
