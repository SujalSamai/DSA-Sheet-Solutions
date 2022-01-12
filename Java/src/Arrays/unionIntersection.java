package Arrays;

import java.util.Arrays;

public class unionIntersection {
    public static void main(String[] args) {
        int[] nums1={1,2,6,8,10};
        int[] nums2={2,6,9};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        int k;
        if(nums1.length>nums2.length){
            k= nums2.length;
        }else{
            k= nums1.length;
        }
        int[] arr= new int[k];

        for (int i = 0; i < nums1.length; i++) {
            int x=0;
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]){
                    arr[x]=nums1[i];
                    x++;
                }
            }
        }
        return arr;
    }
    public static int[] union(int[] nums1, int[] nums2) {
        int k;
        if(nums1.length>nums2.length){
            k= nums1.length;
        }else{
            k= nums2.length;
        }
        int[] arr= new int[k];
        return arr;
    }
}
