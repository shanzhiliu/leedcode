package number_26;

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null) return 0;
        if(nums.length < 2) return nums.length;
        int aviIndex = 0;


        for (int i = 0; i < nums.length; i++) {

            //无用的数字
            if( i > 0 && nums[i] == nums[i - 1]) {

            }
            //有用的数字保存下来
            else {
                 nums[aviIndex] = nums[i];
                 aviIndex ++;
            }
        }

        return aviIndex;
    }
}