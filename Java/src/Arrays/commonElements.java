/*https://practice.geeksforgeeks.org/problems/common-elements1132/1
* Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.*/
package Arrays;

public class commonElements {
    public static void main(String[] args) {
        int[] a={1, 5, 10, 20, 40, 80};
        int[] b={6, 7, 20, 80, 100};
        int[] c= {3, 4, 15, 20, 30, 70, 80, 120};
        common(a,b,c);
    }
    static void common(int[] arr1, int[] arr2, int[] arr3){
        int i=0,j=0,k=0;
        while((i<arr1.length) && (j< arr2.length) && (k< arr3.length)){
            if((arr1[i]==arr2[j]) && (arr3[k]==arr1[i])){
                System.out.print(arr1[i]+" ");
                i++; j++; k++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr3[k]){
                j++;
            }else{
                k++;
            }
        }
    }
}
