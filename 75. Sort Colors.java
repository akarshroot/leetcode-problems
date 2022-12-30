class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for(int i : nums) {
            if(i == 0) zeros++;
            else if(i == 1) ones++;
            else if(i == 2) twos++;
        }
        for(int i = 0; i<nums.length; i++) {
            if(zeros > 0) {
                nums[i] = 0;
                zeros--;
            }
            else if(zeros == 0 && ones > 0) {
                nums[i] = 1;
                ones--;
            }
            else if(zeros == 0 && ones == 0 && twos > 0) {
                nums[i] = 2;
                twos--;
            }
        }
    }
}
