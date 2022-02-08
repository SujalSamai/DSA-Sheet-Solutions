package Strings;
//https://practice.geeksforgeeks.org/problems/second-most-repeated-string-in-a-sequence0534/1#
//Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.
import java.util.HashMap;
import java.util.Map;

public class secondMost {
    public static void main(String[] args) {
        String[] arr={"aaa","bbb","ccc","bbb","aaa","aaa"};
        System.out.println(secFrequent(arr,arr.length));
    }
    static String secFrequent(String[] arr,int N){
        HashMap<String,Integer> map=new HashMap<>();
        for (int i=0;i< arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        String key="";
        int value=0;
        for (Map.Entry mapElements: map.entrySet()){
            key=(String) mapElements.getKey();
            value=(int)mapElements.getValue();
            //first put max element in both fmax and smax, then update fmax, so that the previous max element gets into smax
            if(value>fmax){
                smax=fmax;
                fmax=value;
            }else if(value>smax && value<fmax){
                smax=value;
            }
        }
        //again traverse and when value of a key becomes equal to smax, return the key
        for (Map.Entry mapElements: map.entrySet()) {
            key = (String) mapElements.getKey();
            value = (int) mapElements.getValue();
            if(value==smax) return key;
        }
        return null;
    }
}
