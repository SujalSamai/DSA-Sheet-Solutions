package Arrays;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {
    public static void main(String[] args) {
        int[] nums={100, 4,3,2,102,101,1};
        System.out.println(longestConsecutiveSequence(nums));
    }
    public static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for (int num: nums){
            set.add(num);
        }

        int streak=0;
        for(int num: nums){
            if (!set.contains(num-1)) {   //to make sure that we start counting from the minimal number of the sequence
                //we proceed only when we make sure this is the minimal number of that particular sequence
                int currentNum = num;
                int currentStreak = 1;  //initialising currentstreak from 1

                while (set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                streak = Math.max(streak, currentStreak);
            }
        }
        return streak;
    }
}
