package Strings;
//https://practice.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1#
//Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
//Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every
// character of str1 to every character of str2 while preserving the order.
import java.util.HashMap;

public class isomorphicString {
    public static void main(String[] args) {
        String str1="aab";
        String str2="xxy";
        System.out.println(areIsomorphic(str1,str2));
    }
    public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length() != str2.length()) return false;

        HashMap<Character,Integer> hash = new HashMap<>();
        HashMap<Character,Integer> hash1 = new HashMap<>();
        for(int i = 0;i<str1.length();i++){
            if(!hash.containsKey(str1.charAt(i))){
                //putting the distinct key:value from str1
                hash.put(str1.charAt(i),i);
            }
            if(!hash1.containsKey(str2.charAt(i))){
                //putting the distinct key:value from str2
                hash1.put(str2.charAt(i),i);
            }
            //getting the values at the respective keys and checking if both the values are same
            //as values are basically indexes, if both have same indexes then we can say it is one to one mapping
            int b = hash.get(str1.charAt(i));
            int c = hash1.get(str2.charAt(i));
            if(b != c) return false;
        }
        return true;
    }
}
