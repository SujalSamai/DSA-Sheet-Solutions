package Arrays;

//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
/*Write a function to return minimum and maximum in an array.
Your program should make the minimum number of comparisons.
 */
public class minMaxElArray {
    public static void main(String[] args) {
        int[] arr={12,56,235,74,123,9};
        getResult(arr);
    }
    static void getResult(int[] arr){
        int min= arr[0];
        int max= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum is "+ min + " and Maximum is "+ max);
    }
}
