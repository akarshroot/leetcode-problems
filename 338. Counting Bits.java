class Solution {
    public int[] countBits(int n) {
        int res[] = new int[n+1];
        for(int i = 0; i<=n; i++) {
            int j = i;
            int ones = 0;
            while(j != 0) {
                j = (j)&(j-1);
                ones++;
            }
            res[i] = ones;
        }
        return res;
    }
}
