public class SearchForARange34 {
    //https://leetcode.com/problems/search-for-a-range/description/
    public int[] searchRange(int[] nums, int target) {
        int startIndex,finishIndex;
        int[]range = {-1,-1};
        if(nums.length < 1 || target<nums[0] || target>nums[nums.length-1]) return range;
        if((nums.length == 1 && target == nums[0])){
            range[0] = 0;
            range[1] = 0;
            return range;
        }

        startIndex = helper(nums,target,true);
        if(startIndex==nums.length || nums[startIndex] != target) return range;

        finishIndex = helper(nums,target,false);
        range[0] = startIndex;
        range[1] = finishIndex-1;
        return range;
    }

    public int helper(int[] nums,int target,boolean left){
        int lo=0,hi=nums.length;
        int mid = 0;
        while(lo<hi){
            mid = (lo+hi)/2;
            if(nums[mid]>target || (left && nums[mid] == target)){
                hi = mid;
            }else {
                lo = mid+1;
            }
        }
        return lo;
    }
}
