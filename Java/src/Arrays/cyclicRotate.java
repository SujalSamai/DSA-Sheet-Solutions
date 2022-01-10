package Arrays;

import java.util.Arrays;

public class cyclicRotate {
    public static void main(String[] args) {
        int[] arr={9, 8, 7, 6, 4, 2, 1, 3};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr){
        int n= arr.length-1;
        for (int i = 0; i < n; i++) {
            int pointer= arr[n];
            arr[n]=arr[i];
            arr[i]=pointer;
        }
    }
}
