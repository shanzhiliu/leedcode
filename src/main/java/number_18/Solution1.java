package number_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        //前置处理
        if(nums.length < 4) return result;

        //sort
        Arrays.sort(nums);

        //
        //遍历
        for (int i = 0; i < nums.length - 3; i++) {

            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[i] + nums[i + 1] + nums[i + 2]+ nums[i +3] > target ) break;
            //三数的逻辑
            for (int j = i + 1; j < nums.length - 2; j++) {

                if(j > (i+1)  && nums[j] == nums[j-1]) continue;

                Integer num1 = nums[i];
                Integer num2 = nums[j];

                if(nums[i] + nums[j] + nums[j + 1]+ nums[j + 2] > target ) break;

                int left = j + 1;
                int right= nums.length - 1;

                while (left < right) {


                    if(num1 + num2 + nums[left] + nums[right] > target) {
                        right --;
                    }
                    else if(num1 + num2 + nums[left] + nums[right] < target) {
                        left ++;
                    }
                    else {
                        List<Integer> item = new ArrayList<>();
                        item.add(num1);
                        item.add(num2);
                        item.add(nums[left]);
                        item.add(nums[right]);
                        result.add(item);

                        while (left < right && nums[left] == nums[left + 1]) {
                            left ++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right --;
                        }

                        left ++;
                        right --;

                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Solution1 solution = new Solution1();


        System.out.println(solution.fourSum(new int[]{1,-2,-5,-4,-3,3,3,5},-11));
    }

}