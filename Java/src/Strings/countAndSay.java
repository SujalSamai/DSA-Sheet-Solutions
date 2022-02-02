package Strings;
//https://leetcode.com/problems/count-and-say/
public class countAndSay {
    public static void main(String[] args) {
        int n=4;
        System.out.println(count(n));
    }
    public static String count(int n) {

        //base case
        if(n==1) return "1";

        String s = count(n-1);
//        String s="";
        StringBuilder res= new StringBuilder();
        int counter= 0;

        for(int i=0;i<s.length();i++)
        {
            counter++;  //frequency calculator
            //segregating into groups
            if( i== s.length()-1 || s.charAt(i) != s.charAt(i+1))
            {
//                res= res+counter+s.charAt(i);
                res.append(counter).append(s.charAt(i));
                counter=0;
            }
        }

//        return res;
        return res.toString();

    }
}
