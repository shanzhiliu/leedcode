package number_209;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        if(nums.length < 1) return 0;

        int minCount = 0;

        for (int i = 0; i < nums.length; i++) {

            int cuSum = 0 ;
            for (int j = i; j < nums.length; j++) {
                cuSum += nums[j];
                if(cuSum >= target) {

                    if(minCount == 0) {
                        minCount = j - i + 1;
                    }
                    else  {
                        minCount = Math.min(minCount,j - i + 1);
                    }
                }
            }
        }

        return minCount;
    }
}