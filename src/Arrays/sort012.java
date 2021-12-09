package Arrays;
//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
/*Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algorithm*/
import java.util.Arrays;


public class sort012 {
    public static void main(String[] args) {
        int[] a= {0,2,1,2,0};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    //brute force
    static void sort(int[] arr){
        int ctOne=0;
        int ctTwo=0;
        int ctZero=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                ctZero++;
            }else if(arr[i]==1){
                ctOne++;
            }else if(arr[i]==2){
                ctTwo++;
            }
        }
        int k=0;
        while(ctZero>0){
            arr[k]=0;
            k++;
            ctZero--;
        }
        while(ctOne>0){
            arr[k]=1;
            k++;
            ctOne--;
        }
        while (ctTwo>0){
            arr[k]=2;
            k++;
            ctTwo--;
        }
    }
}
