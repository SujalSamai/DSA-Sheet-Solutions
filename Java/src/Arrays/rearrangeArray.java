package Arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/rearrange-array-alternating-positive-negative-items-o1-extra-space/
//Rearrange array in alternating positive & negative items with O(1) extra space, arrange them in an alternate
// fashion such that every positive number is followed by negative and vice-versa maintaining the order of appearance.
public class rearrangeArray {
    public static void main(String[] args) {
        int[] arr={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int n=arr.length;
        System.out.println(Arrays.toString(rearrange(arr,n)));
    }

    //three pointers approach
    //we need a negative number in odd place(index) and a positive number in even place as per question
    static int[] rearrange(int[] nums, int n){
        int i=0, j=0, k=0;
        while(k<n && j<n && i<n){
            if(k%2==0){
                if(nums[k]>=0){
                    i=k;
                    j=k;
                    while (i<n && nums[i]>=0){
                        i++;
                    }
                    if(i>=n) break;
                    rotate(nums,j,i);
                }
            }
            else{
                if(nums[k]<0){
                    i=k;
                    j=k;
                    while(j<n && nums[j]<0) j++;
                    if(j>=n) break;
                    rotate(nums,i,j);
                }
            }
            k++;
        }
        return nums;
    }

    //we are rotating and not sorting because, we don't want to alter the order
    static void rotate(int[] nums, int start, int end){
        int temp= nums[end];
        for(int i=end-1; i>=start;i--){
            nums[i+1]=nums[i];
        }
        nums[start]=temp;
    }
}
