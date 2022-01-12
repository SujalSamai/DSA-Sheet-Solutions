package Arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
//An array contains both positive and negative numbers in random order.
// Rearrange the array elements so that all negative numbers appear before all positive numbers.
//Note: Order of elements is not important here.
//Difficulty level : Easy
public class negToLeft {
    public static void main(String[] args) {
        int[] arr= {-12,11,-13,-5,6,-7,5,-3,-6};
        left(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Two pointers approach
    static void left(int[] arr){
        int low= 0;
        int high= arr.length-1;
        while(low<=high){
            if(arr[low]<0){
                low++;
            }else if(arr[low]>0){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}
