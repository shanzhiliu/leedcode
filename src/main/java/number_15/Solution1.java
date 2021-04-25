package number_15;

import java.util.*;

class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {

        Set  result = new HashSet();

        Arrays.sort(nums);

        Map<Integer,Integer> valueIndexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            valueIndexMap.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            int currentTarget  = nums[i] * (-1) ;
            //有序数组,大于0,就停止循环
            if(currentTarget < 0) {
                break;
            }

            for (int j =  i + 1; j < nums.length; j++) {
                int currentValueJ = nums[j];
                int currentValueK = currentTarget - currentValueJ;

                Integer indexK = valueIndexMap.get(currentValueK);

                // i< j < indexK
                if(indexK != null && j < indexK ) {
                    List list = new ArrayList();
                    list.add(nums[i]);
                    list.add(currentValueJ);
                    list.add(currentValueK);
                    Collections.sort(list);
                    result.add(list);
                }
            }
        }
        return new ArrayList<>(result);
    }

}