package Strings;
//https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1
//Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S).
// Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.
// Incase of conflict, return the substring which occurs first ( with the least starting index).

import java.util.ArrayList;

public class longestPalindrome {
    public static void main(String[] args) {
        String s="aaaabbaa";
        System.out.println(longestPalin(s));
    }
    static String longestPalin(String S){
        String x="";
        String max="";
        int indexMax=0;
        int index=0;
        ArrayList<String> ar=new ArrayList<String>();
        for(int i=0;i<S.length();i++)
        {
            index=i;
            for(int j=i;j<S.length();j++)
            {
                x=x+S.charAt(j);

                if(paline(x)>0)
                {
                    if(x.length()>max.length())
                    {
                        max=x;
                        indexMax=i;
                    }
                    if(x.length()==max.length())
                    {
                        if(indexMax>index)
                        {
                            max=x;
                        }
                    }

                }

            }
            x="";
        }
        return max;
    }
    static int paline(String S)
    {
        for(int i=0,j=S.length()-1;i<=j;i++,j--)
        {
            if(S.charAt(i)!=S.charAt(j))
            {
                return 0;
            }

        }
        return S.length();
    }
}
