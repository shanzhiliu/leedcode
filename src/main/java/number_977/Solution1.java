package number_977;

import java.util.Arrays;

class Solution1 {

    public int[] sortedSquares(int[] nums) {

        if(nums == null || nums.length < 1) return null;

        int left = 0;
        int right = nums.length - 1;

        int[] result = new int[nums.length];
        int rightIndex = nums.length - 1;

        while (left <= right) {

            if(Math.abs(nums[left]) > Math.abs(nums[right]) ) {
                result[rightIndex] = nums[left] * nums[left];
                left ++;
            }
            else {
                result[rightIndex] = nums[right] * nums[right];
                right --;
            }

            rightIndex --;
        }
        return  result;

    }

}