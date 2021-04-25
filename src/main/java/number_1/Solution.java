package number_1;

class Solution {

    public int[] twoSum(int[] nums, int target) {

//       暴力穷举
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int currentValueI = nums[i];

            for (int j = i+1; j < nums.length; j++) {
                int currentValueJ = nums[j];

                if(currentValueI + currentValueJ == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }

            }
        }

        return result;
    }
}