import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/3sum/description/
public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0 ; i+2 < nums.length ; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1,k=nums.length-1;k>j; ){
                if(nums[i]+nums[j]+nums[k] == 0){
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(k>j && nums[k]==nums[k+1]) k--;
                }else if(nums[i]+nums[j]+nums[k]> 0) k--;
                else{
                    j++;
                }
            }
        }
        return list;
    }
}
