package Searching;
//https://practice.geeksforgeeks.org/problems/searching-in-an-array-where-adjacent-differ-by-at-most-k0456/1/
//A step array is an array of integers where each element has a difference of at most k with its neighbor.
//Given a key x, we need to find the index value of x if multiple-element exist to return the first occurrence of the key.
public class differByK {
    public static void main(String[] args) {
        int[] arr={20,40,50,70,70,60};
        int k=20;
        int x=60;
        System.out.println(search(arr,k,x));
    }

    static int search(int[] arr,int k, int x) {
        int i = 0;

        while (i < arr.length) {

            // If x is found at index i
            if (arr[i] == x)
                return i;

            //if suppose we are pointing to 20, then the next element can be at max either 40 or min 0 due to x
            //so if we are searching then there is no point in checking the next index as 60 won't be available there at any cost
            //to find steps we are simply doing the below step
            int steps=(arr[i]-x)/k;
            i = i + Math.max(1, Math.abs(steps));
        }
        return -1;
    }
}
