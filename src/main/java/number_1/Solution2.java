package number_1;

import java.util.HashMap;
import java.util.Map;

class Solution2 {

    public int[] twoSum(int[] nums, int target) {

        //根据target 和 currentValueI 可以求出currentValueJ,如果currentValueJ,有对应的下标,可以直接求出结果了
        //遍历数组得到,Map (value -> index),value值重复有没有问题,根据题目描述是没有问题的,会保存最后一个index的
        Map<Integer,Integer> valueIndexMap = new HashMap<Integer, Integer>();

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int currentValueI = nums[i];
            int currentValueJ = target - currentValueI;

            Integer indexJ = valueIndexMap.get(currentValueJ);

            //重复的要排除掉
            if(indexJ != null && i != indexJ) {
                result[0] = i;
                result[1] = indexJ;
                return result;
            }

            //不包含,加进去
            if(!valueIndexMap.containsKey(currentValueI)) {
                valueIndexMap.put(currentValueI, i);
            }

        }

        return result;

    }
}