package Searching;
//https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
//An element in a sorted array can be found in O(log n) time via binary search.
// But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand.
// So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.

public class pivotElement {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int n = arr.length;
        int key = 6;
        int i = search(arr, 0, n - 1, key);
        if (i != -1)
            System.out.println("Index: " + i);
        else
            System.out.println("Key not found");
    }

    static int search(int[] arr, int l, int h, int key) {
        if (l > h)
            return -1;

        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;

        /* If arr[l...mid] first subarray is sorted */
        if (arr[l] <= arr[mid]) {
            /* As this subarray is sorted, we can quickly check if key lies in half or other half */
            if (key >= arr[l] && key <= arr[mid]){
                return search(arr, l, mid - 1, key);
            }
            /*If key not lies in first half subarray, Divide other half  into two subarrays,
            such that we can quickly check if key in other half */

            return search(arr, mid + 1, h, key);
        }

        /* If arr[l..mid] first subarray is not sorted,
           then arr[mid... h] must be sorted subarray*/

        if (key >= arr[mid] && key <= arr[h]){
            return search(arr, mid + 1, h, key);
        }

        return search(arr, l, mid - 1, key);
    }
}

