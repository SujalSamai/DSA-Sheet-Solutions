package Strings;
//https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/
//Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
public class Rotations {
    public static void main(String[] args) {
        String st1="AACD";
        String str2="ACDA";

        System.out.println(areRotations(st1,str2));
    }
    //the concept is we will add str1 with itself and check if str2 is present in it or not
    //in our example-> str1+str1= AACDAACD which clearly contains str2
    static boolean areRotations(String s1, String s2){
        return (s1.length()==s2.length())&&((s1 + s1).contains(s2));
    }
}
