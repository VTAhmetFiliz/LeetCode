import java.util.Arrays;
//https://leetcode.com/problems/longest-consecutive-sequence/description/
public class LongestConsecutiveSequence128 {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1) return 0;
        Arrays.sort(nums);
        int count = 0,max = 0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i]==nums[i+1]) continue;
            if(nums[i+1] == nums[i] + 1) count++;
            else {
                if(count > max){
                    max = count;
                }
                count = 0;

            }
        }
        if(count > max){
            max = count;
        }
        return max+1;
    }
}
