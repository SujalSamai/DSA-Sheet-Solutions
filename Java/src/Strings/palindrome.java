package Strings;
//https://practice.geeksforgeeks.org/problems/palindrome-string0817/1
//Given a string S, check if it is palindrome or not.
//Difficulty: Easy
public class palindrome {
    public static void main(String[] args) {
        String s="abba";
        System.out.println(isPalindrome(s));
    }
    static int isPalindrome(String S){
        String str="";
        for (int i = S.length()-1; i >=0 ; i--) {
            str+=S.charAt(i);
        }

        if(S.toLowerCase().equals(str.toLowerCase())){
            return 1;
        }
        return 0;
    }
}
