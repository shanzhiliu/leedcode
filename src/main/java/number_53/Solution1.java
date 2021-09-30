package number_53;

import java.util.LinkedList;


// 滑动窗口方式 卒
class Solution1 {

    public int maxSubArray(int[] nums) {

        if(nums.length == 1 ) return  nums[0];
        int max = Integer.MIN_VALUE;

        LinkedList<Integer> slider = new LinkedList<>();
        int cuMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            slider.add(nums[i]);

        }


        return max;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.maxSubArray(new int[]{-1,-2}));
    }
}