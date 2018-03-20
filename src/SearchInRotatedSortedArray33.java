public class SearchInRotatedSortedArray33 {
    //https://leetcode.com/problems/search-in-rotated-sorted-array/description/
    public int search(int[] nums, int target) {
        int i;
        if(nums.length > 0){
            if(target < nums[nums.length-1]){
                i = nums.length-1;
                while(i-1 >= 0 && target <= nums[i] && nums[i-1]<nums[i]){
                    if(target == nums[i]) return i;
                    if(target == nums[i-1]) return i-1;
                    i--;
                }
            }else if (target > nums[0]){
                i = 0;
                while(i+1 < nums.length && target >= nums[i] && nums[i+1] > nums[i]){
                    if(target == nums[i]) return i;
                    if(target == nums[i+1]) return i+1;
                    i++;
                }
            }else if (target == nums[nums.length-1]){
                return nums.length-1;
            }else if (target == nums[0]){
                return 0;
            }
        }
        return -1;
    }
}
