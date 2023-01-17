class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int currentProd = 1;
        int res = 0;
        int i = 0;
        for(int j = 0; j<nums.length; j++) {
            currentProd *= nums[j];
            while(currentProd >= k) {
                currentProd /= nums[i];
                i++;
            }
            res += j - i + 1;
        }
        return res;
    }
}


