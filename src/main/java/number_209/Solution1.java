package number_209;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution1 {
    public int minSubArrayLen(int target, int[] nums) {

        if(nums.length < 1) return 0;

        int minCount = 0;

        LinkedList<Integer> slider = new LinkedList<>();
        int sliderSum = 0;

        for (int i = 0; i < nums.length; i++) {

            slider.add(nums[i]);
            sliderSum += nums[i];

            while (sliderSum >= target) {

                if(minCount == 0) {
                    minCount = slider.size();
                }
                else {
                    minCount = Math.min(minCount,slider.size());
                }
                Integer first = slider.pollFirst();
                sliderSum -= first;
            }

        }

        return minCount;
    }
}