import java.util.Arrays;

public class FirstMissingPositive41 {
    //https://leetcode.com/problems/first-missing-positive/description/
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 0) return 1;
        if(nums.length < 2){
            if(nums[0] != 1) return 1;
            else return 2;
        }
        Arrays.sort(nums);
        int i = 0 , k = 1;
        while(nums[i]<=0) i++;
        for( ; i < nums.length;i++,k++){
            while(i< nums.length-1 && nums[i] == nums[i+1])i++;
            if(k != nums[i]) return k;
        }
        return k;
    }
}
