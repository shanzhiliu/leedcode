package number_15;

import java.util.*;

class Solution4 {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result= new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int currentValue = nums[i];
            if(currentValue > 0) {
                break;
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
                    left ++;
                    right--;
                }

            }

        }

        return new ArrayList<>(result);

    }

    public static void main(String[] args) {
        Solution4 solution3 = new Solution4();



        List<List<Integer>> lists = solution3.threeSum(new int[]{-1,0,1,2,-1,-4});

        lists.stream().forEach(s -> {
            s.stream().forEach(item -> System.out.print(item + ",")
            );
            System.out.println("");
        } );
    }

}