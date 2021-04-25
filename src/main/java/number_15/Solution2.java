package number_15;

import java.util.*;

class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set result = new HashSet();

        for (int i = 0; i < nums.length - 1; i++) {
            int startValue  = nums[i];
            //有序数组,大于0,就停止循环
            if(startValue > 0) {
                break;
            }

            int left = i + 1;
            int right = nums.length - 1;

            //有序数组,大于0,等于0会有重复元素,就停止循环
//            if(startValue == nums[left]) {
//                break;
//            }

            while (left < right) {
                int cuValue = nums[i] + nums[left] + nums[right];

                if(cuValue < 0) {
                    left ++;
                } else if(cuValue > 0) {
                    right --;
                } else {

                    List itemResultList = new ArrayList();
                    itemResultList.add(nums[i]);
                    itemResultList.add(nums[left]);
                    itemResultList.add(nums[right]);
                    left ++;
                    right--;
                    result.add(itemResultList);
                }

            }
        }

        return new ArrayList<>(result);
    }

}