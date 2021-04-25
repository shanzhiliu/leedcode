package number_1;

import org.junit.Test;

import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SolutionTest {
    @Test
    public void  test1(){

        int[] nums = new int[]{3,2,4};
        int target = 6;

        Solution1 solution1 = new Solution1();
        int[] ints = solution1.twoSum(nums, target);
        System.out.println(Arrays.toString(ints));

    }

    @Test
    public void  test2(){

        int[] nums = new int[]{3,2,4};
        int target = 6;

        Solution1 solution2 = new Solution1();
        int[] ints = solution2.twoSum(nums, target);
        System.out.println(Arrays.toString(ints));

    }

}
