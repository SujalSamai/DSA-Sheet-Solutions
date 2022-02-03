package Searching;
//https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
//Given a sorted array arr containing n elements with possibly duplicate elements,
//the task is to find indexes of first and last occurrences of an element x in the given array.
import java.util.ArrayList;

public class FirstAndLast {
    public static void main(String[] args) {
        long[] arr={1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int x=5;
        System.out.println(find(arr,arr.length,x));
    }
    static ArrayList<Long> find(long[] arr, int n, int x)
    {
        ArrayList<Long> list= new ArrayList<>();
        long indx1=-1, indx2=-1;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==x){
                indx1=mid;
                e=mid-1;  ////this line is to make sure that we get the index of first occurence only
            }else if(arr[mid]>x){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        s=0;
        e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==x){
                indx2=mid;
                s=mid+1;  //this line is to make sure that we get the index of last occurence only
            }else if(arr[mid]>x){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        list.add(indx1);
        list.add(indx2);
        return list;
    }
}
