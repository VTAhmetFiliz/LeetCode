public class SlidingWindowMaximum239 {
    //https://leetcode.com/problems/sliding-window-maximum/description/
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1) return nums;
        if(nums.length<1 || k <1) return new int[0];
        int [] solution = new int[nums.length-k+1];
        int maxIndex=0,end = k-1;
        maxIndex = findMax(nums,k,0);
        solution[0] = nums[maxIndex];
        for(int i = 0 ; i < nums.length-k+1 ; i++,end++){
            if(i > maxIndex){
                maxIndex = findMax(nums,k,i);
            }
            if(nums[end]>nums[maxIndex]){
                maxIndex = end;
            }
            solution[i] = nums[maxIndex];
        }
        return solution;
    }

    public int findMax(int [] nums , int k , int startIndex){
        int max = Integer.MIN_VALUE;
        int maxIndex = 0 ;
        for(int i = startIndex ; i<=startIndex+k-1 ; i++){
            if(max < nums[i]){
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
