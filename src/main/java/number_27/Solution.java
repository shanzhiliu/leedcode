package number_27;

class Solution {
    public int removeElement(int[] nums, int val) {

        int slowIndex =0;
        int fastIndex =0;

        for (fastIndex = 0; fastIndex < nums.length; fastIndex++) {

            if(nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex ++;
            }
        }
        return slowIndex;

    }
}