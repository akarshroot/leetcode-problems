class Solution {
    static int calculateArea(int length, int height) {
        return length*height;
    }
    
    public int maxArea(int[] height) {
        int areaMax = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while(i < j) {
            int area = height[i] > height[j] ? calculateArea(j-i, height[j]) : calculateArea(j-i, height[i]);
            if(area > areaMax) {
                areaMax = area;
            }
            if(height[i] <= height[j]) i++;
            else j--;
        }
        return areaMax;
    }
}
