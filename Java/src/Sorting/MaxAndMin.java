package Sorting;
//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
//Maximum and minimum of an array using minimum number of comparisons
public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        getMinMax(arr);
    }
    static void getMinMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max Element is "+max+" Min Element is "+min);
    }
}
