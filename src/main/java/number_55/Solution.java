package number_55;

class Solution {
    public boolean canJump(int[] nums) {

        if(nums.length < 1) return false;

        int cuMax = 1;
        int size = nums.length;
        for (int i = 0; i < cuMax && i < size; i++) {
            int cuValue = i + 1 + nums[i];

            if(cuValue > cuMax ) {
                cuMax = cuValue;
            }

            if(cuMax >= size) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
            int[] nums = {0};
            Solution solution = new Solution();
            boolean b = solution.canJump(nums);
            System.out.println(b);
    }


}
/**
 *
 * 从第一个位置开始遍历,能到达的最大值为cuMax,
 * 每个index的cuValue 是  index + 1 + num[index]
 * 比较cuValue 和 cuMax,cuMax取最大的值.
 * 每一步对比,cuValue >= size . 符合返回true
 *
 */
