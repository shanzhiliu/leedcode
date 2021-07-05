package number_15;

import java.util.*;

class Solution3 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>>  result= new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int currentValue = nums[i];
            if(currentValue > 0) {
                break;
            }
            if( i>0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length -1;


            while (left < right) {

                int targetValue = currentValue + nums[left] + nums[right];

                if(targetValue > 0) {
                    right --;
                }

                else if(targetValue < 0) {
                    left ++;
                }

                else {

                    Integer[] list = new Integer[]{nums[i],nums[left],nums[right]};
                    List<Integer> itemResult = Arrays.asList(list);
                    result.add(itemResult);

                    while (left < right && nums[left] == nums[left + 1]) {
                        left ++;
                    }

                    while (left < right && nums[right] == nums[left - 1]) {
                        right --;
                    }

                    left ++;
                    right--;
                }

            }

        }

        return result;

    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();



        List<List<Integer>> lists = solution3.threeSum(new int[]{-1,0,1,2,-1,-4});

        lists.stream().forEach(s -> {
            s.stream().forEach(item -> System.out.print(item + ",")
            );
            System.out.println("");
        } );
    }

}