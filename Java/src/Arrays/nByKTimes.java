/*https://www.geeksforgeeks.org/given-an-array-of-of-size-n-finds-all-the-elements-that-appear-more-than-nk-times/
Given an array of size n and a number k, find all elements that appear more than n/k times*/

package Arrays;

public class nByKTimes {
    public static void main(String[] args) {
        int[] arr={1,2};
        int k=3;
        moreThanNbyK(arr,k);
    }
    //brute-force
    static void moreThanNbyK(int[] arr, int k){
        int n= arr.length;
        int key= n/k;
        for (int i = 0; i < n; i++) {
            int count=1;
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>key){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
