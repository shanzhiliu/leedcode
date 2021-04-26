package number_11;

class Solution1 {
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
                while (left < right && height[left] < height[left - 1]) {
                    left ++;
                }
            }
            else {
                right --;
                while (left < right && height[right] < height[right + 1]) {
                    right --;
                }
            }
        }
        return maxArea;
    }
}