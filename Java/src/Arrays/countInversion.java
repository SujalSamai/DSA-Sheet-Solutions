/*https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1
Given an array of integers. Find the Inversion Count in the array.
Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted.
If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then
the inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.*/
package Arrays;

public class countInversion {
    public static void main(String[] args) {
        long[] arr={2,3,4,5,6};
        System.out.println(inversionCount(arr));
    }
    static long inversionCount(long[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
