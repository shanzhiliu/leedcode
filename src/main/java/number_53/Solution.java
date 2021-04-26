package number_53;

class Solution {

    public int maxSubArray(int[] nums) {

        if(nums.length == 1 ) return  nums[0];

        int left = 0;
        int right = 0;
        int cuWinValue = nums[0];
        int max = cuWinValue;

        while (right < nums.length -1 ) {

            if(cuWinValue <= 0) {
                right ++;
                left = right;
                cuWinValue = nums[right];
                if(cuWinValue > max) {
                    max = cuWinValue;
                }
            }
            else {
                right ++;
                cuWinValue = cuWinValue + nums[right];
                if(cuWinValue > max) {
                    max = cuWinValue;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[]{-1,-2}));
    }
}