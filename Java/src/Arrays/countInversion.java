package Arrays;
//https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1#
//Given an array of integers. Find the Inversion Count in the array.
//Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted.
//If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then
// the inversion count is the maximum. Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

public class countInversion {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int[] temp= new int[arr.length];

//        System.out.println(inversionCount(arr,5));
        System.out.println(mergeSort(arr,temp,0,arr.length-1));
    }

    static long inversionCount(long[] arr, long N){
        //brute-force
        int count=0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    //Merge-Sort
    static int mergeSort(int[] arr, int[] temp,int left,int right){
        int mid, inv_count=0;
        if(right>left){
            mid=(right+left)/2;

            inv_count+= mergeSort(arr,temp,left,mid);
            inv_count+= mergeSort(arr,temp,mid+1,right);

            inv_count+=merge(arr,temp,left,mid+1,right);
        }
        return inv_count;
    }

    static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i, j, k;
        int inv_count=0;
        i=left;
        j=mid;
        k=left;
        while((i<=mid-1) && (j<=right)){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
                inv_count=inv_count+(mid-i);
            }
        }

        while(i<=mid-1){
            temp[k++]=arr[i++];
        }
        while (j<=right){
            temp[k++]=arr[j++];
        }
        for (i=left;i<=right;i++){
            arr[i]=temp[i];
        }
        return inv_count;
    }


}
