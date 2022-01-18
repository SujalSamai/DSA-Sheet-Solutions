package Strings;

import java.util.HashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/
//Write an efficient program to print all the duplicates and their counts in the input string
public class duplicatesInString {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        printDups(str);
    }

    static void printDups(String str) {
        Map<Character, Integer> sol=new HashMap<>();
        for(char ch: str.toCharArray()){
            sol.compute(ch,((character, integer) -> sol.getOrDefault(character,0)+1));
        }

        for (char ch:sol.keySet()){
            if(sol.get(ch)>1){
                System.out.println(ch);
            }
        }
    }
}
