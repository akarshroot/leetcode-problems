class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        for(int i = 1; i<n; i++) {
            nums[i] += nums[i - 1];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i<n; i++) {
            int x = 1;
            if(map.containsKey(nums[i] - k)) res += map.get(nums[i] - k);
            if(map.containsKey(nums[i])) x = map.get(nums[i]) + 1;
            map.put(nums[i], x);
        }
        return res;
    }
}
