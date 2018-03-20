public class MaximumProductSubarray152 {
    //https://leetcode.com/problems/maximum-product-subarray/description/
    public int maxProduct(int[] nums) {
        if(nums.length<1 || nums ==null) return 0;
        int min = nums[0],max = nums[0],result = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            int temp = max;
            max = Math.max(Math.max(min*nums[i],max*nums[i]),nums[i]);
            min = Math.min(Math.min(temp*nums[i],min*nums[i]),nums[i]);
            if(max > result) result = max;
        }
        return result;
    }
}
