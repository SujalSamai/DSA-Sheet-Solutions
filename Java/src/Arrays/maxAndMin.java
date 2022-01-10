package Arrays;
//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
//Difficulty Level: Easy
//Write a function to return minimum and maximum in an array. Your program should make the minimum number of comparisons.
public class maxAndMin {
    public static void main(String[] args) {
        int[] arr={45,64,56,78,12,0,21};
        minMax(arr);
    }

    static void minMax(int[] arr){
        int max= arr[0];
        int min=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];       //if the value is max, it doesn't checks for min
            }else if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
