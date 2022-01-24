package Arrays;
//https://practice.geeksforgeeks.org/problems/three-way-partitioning/1
//Given an array of size n and a range [a, b]. The task is to partition the array around the range such that array is divided into three parts.
//1) All elements smaller than a come first.
//2) All elements in range a to b come next.
//3) All elements greater than b appear in the end.
//The individual elements of three sets can appear in any order. You are required to return the modified array.
public class threeWay {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4};
        int a=1;
        int b=2;
        threeWayPartition(arr, a,b);
    }

    //just like dutch national flag problem
    public static void threeWayPartition(int array[], int a, int b)
    {
        int start=0;
        int end= array.length-1;
        for (int i=0; i<=end; i++){
            if(array[i]<a){
                swap(array,i,start);
                start++;
            }else if(array[i]>b){
                swap(array,i,end);
                end--;
                i--;
            }
        }
    }
    static void swap(int[]arr, int a, int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
