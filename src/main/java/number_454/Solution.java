package number_454;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        //key两数之和,value两数之和的出现的次数
        Map<Integer,Integer> sumCountMap = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];
                if(sumCountMap.containsKey(sum)) {
                    sumCountMap.put(sum,sumCountMap.get(sum) + 1);
                }
                else {
                    sumCountMap.put(sum, 1);
                }
            }
        }


        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int sum = nums3[i] + nums4[j];
                if(sumCountMap.containsKey(-sum)){
                    count += sumCountMap.get(-sum);
                }

            }
        }

        return count;

    }
}