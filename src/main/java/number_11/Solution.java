package number_11;

class Solution {
    public int maxArea(int[] height) {

        if(height.length < 2) return 0;

        int left = 0;
        int right = height.length -1;
        int maxArea = 0;

        while (left <= right) {

            int cuHeight = Math.min(height[left] , height[right]);
            int cuArea = cuHeight * (right - left);
            if(cuArea > maxArea) {
                maxArea = cuArea;
            }
            if(height[left] < height[right]) {
               left ++;
            }
            else {
                right --;
            }
        }
        return maxArea;
    }
}