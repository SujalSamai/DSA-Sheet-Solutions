package Searching;
//https://leetcode.com/problems/majority-element/
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

public class majorityElement {
    public static void main(String[] args) {
        int[] arr={3,1,3,3,2};
        int size= arr.length;
        System.out.println(majorityElem(arr,size));
    }

    //Moore's Voting Algo
    //In this algorithm, we traverse the whole array and divide it into several parts
    //the parts are based on the fact that, the part has majority and minority element equal so they cancel out each other
    //when in a part, an element will have clear majority over other minorities, that element will be the majority one

    //leetcode
    static int majorityEl(int[] a,int size){
        int count=0;
        int candidate=0;
        for (int i=0; i<size; i++){
            if(count==0){
                candidate=a[i];
            }
            if(a[i]==candidate){
                count+=1;
            }else{
                count-=1;
            }
        }
        return candidate;
    }

    //gfg
    static boolean isMajority(int[] arr, int size, int candidate){
        int counter=0;
        for (int i=0; i<size; i++){
            if(arr[i]==candidate){
                counter++;
            }
        }
        return (counter>(size/2));
    }
    static int majorityElem(int[] a, int size){
        int count=0;
        int candidate=0;
        for (int i=0; i<size; i++){
            if(count==0){
                candidate=a[i];
                count=1;
            }
            else {
                if(a[i]==candidate){
                    count++;
                }else {
                    count--;
                }
            }
        }
        if(isMajority(a,size,candidate)){
            return candidate;
        }else {
            return -1;
        }
    }
}
