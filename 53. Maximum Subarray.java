class Solution {
    public int maxSubArray(int[] nums) {
        int curMax = nums[0], preMax = nums[0];
        for (int i = 1; i < nums.length; i++){
            preMax = Math.max(preMax + nums[i], nums[i]);
            curMax = Math.max(curMax, preMax);
        }
        return curMax;
    }
}
