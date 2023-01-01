class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int superList[] = new int[nums1.length + nums2.length];
        int itr = 0;
        for(int i : nums1) superList[itr++] = i;
        for(int i : nums2) superList[itr++] = i;
        Arrays.sort(superList);
        if(superList.length%2 == 0) {
            return (double) (superList[superList.length/2] + superList[(superList.length/2) - 1])/2;
        }
        else {
            return (double) superList[superList.length/2];
        }
    }
}
