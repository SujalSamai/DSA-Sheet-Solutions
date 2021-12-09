package Arrays;
//https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("How many elements? ");
        int a = sc.nextInt();
        int[] arr= new int[a];
        for (int i = 0; i < a; i++) {
            arr[i]= sc.nextInt();
        }
        ReverseArr(arr);
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i]);
        }
    }
    static void ReverseArr(int[] arr){
        int start= 0;
        int end= arr.length-1;
        int temp;
        while(start<end){
            temp= arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
