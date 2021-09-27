package number_11;

class Solution2 {
    public int maxArea(int[] height) {

        if(height.length < 2) return 0;

        int L = 0;
        int R = height.length -1;
        int maxArea = 0;

        while (L < R) {
            int cuArea = Math.min(height[L], height[R]) * (R - L);
            maxArea = Math.max(maxArea,cuArea);

            if(height[L] < height[R]) {
                L ++;
            }
            else {
                R --;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

    }
}