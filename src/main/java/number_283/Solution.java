package number_283;

class Solution {
    public void moveZeroes(int[] nums) {

        if(nums == null || nums.length < 2) return;

        int aviIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            //有用的
            if(nums[i] != 0) {
                nums[aviIndex] = nums[i];
                aviIndex ++;
            }
        }

        //剩余无效的补0
        while (aviIndex < nums.length) {
            nums[aviIndex] = 0;
            aviIndex++;
        }

    }
}