package number_27;

class Solution1 {
    public int removeElement(int[] nums, int val) {

        if(nums.length < 1) return 0;
        int aviIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            //不等于 说明这个数字有效,需要赋值给aviIndex的位置
            if(nums[i] != val) {
                nums[aviIndex] = nums[i];
                aviIndex ++;
            }
        }

        return aviIndex;
    }
}