package Arrays;
//https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1#
//Given a Integer array A[] of n elements. Your task is to complete the function PalinArray.
// Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

public class palindromicArr {
    public static void main(String[] args) {

    }
    static int PalinArray(int a[], int n)
    {
        for (int i=0; i<n; i++){
            int temp= a[i];
            int reverse=0;
            while (temp!=0){
                int rem=temp%10;
                reverse=reverse*10+rem;
                temp=temp/10;
            }
            if(reverse!=a[i]){
                return 0;
            }
        }
        return 1;
    }
}
