package number_15;


import org.junit.Test;

import java.util.*;

public class SolutionTest {
    @Test
    public void  test1(){

        int[] nums = new int[]{-1,0,1,2,-1,-4};

        Solution solution1 = new Solution();
        List<List<Integer>> lists = solution1.threeSum(nums);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }

    }

    @Test
    public void  test3(){

        int[] nums = new int[]{-1,0,1,2,-1,-4};

        Solution2 solution2 = new Solution2();
        List<List<Integer>> lists = solution2.threeSum(nums);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }

    }


}
