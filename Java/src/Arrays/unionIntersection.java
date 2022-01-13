package Arrays;
//https://leetcode.com/problems/intersection-of-two-arrays/
//Given two integer arrays nums1 and nums2, return an array of their intersection and union.
// Each element in the result must be unique and you may return the result in any order.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class unionIntersection {
    public static void main(String[] args) {
        int[] nums1={1,2,6,8,10};
        int[] nums2={2,6,9};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
        System.out.println(Arrays.toString(union(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums1) {
            hs.add(i);
        }
        for (int i : nums2) {
            if (hs.contains(i)) {
                ans.add(i);       //Adding the intersected element in the ArrayList
                hs.remove(i);    //removing the element which is same so that it doesn't gets checked again
            }
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
    public static int[] union(int[] nums1, int[] nums2) {
        HashSet<Integer> s= new HashSet<>();
        for (int k : nums1) {
            s.add(k);
        }
        for (int j : nums2) {
            s.add(j);
        }
        int[] arr= new int[s.size()];
        int i=0;
        for(int el: s){
            arr[i++]=el;
        }
        return arr;
    }
}
