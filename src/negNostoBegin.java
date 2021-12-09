//https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
/*An array contains both positive and negative numbers in random order.
Rearrange the array elements so that all negative numbers appear before all positive numbers.*/
import java.util.Arrays;

public class negNostoBegin {
    public static void main(String[] args) {
        int[] arr={-12, 7, -9, -4, 2};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rearrange(int[] arr)
    {
        int j = 0, temp;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {    //if element is positive it becomes false and hence i becomes >j
                if (i != j) {    //once i becomes >j, this condition is true and it swaps till +ve number reaches end
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}
